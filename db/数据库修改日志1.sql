
/* ******************************************************************************************************************* */

-- 2013-05-09

-- JEHR_user

USE [BDTOA]
GO

/****** Object:  Table [dbo].[JEHR_user]    Script Date: 2013-05-09 16:24:54 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[JEHR_user](
	[ur_id] [int] primary key identity,
	[user_id] [int] NULL,
	[is_able_work_order_report] [tinyint] NULL,
	[is_able_work_order_sponsor] [tinyint] NULL,
	[is_able_work_order_accept] [tinyint] NULL,
	[is_public_work_diary] [tinyint] NULL
)

GO

ALTER TABLE [dbo].[JEHR_user] ADD  CONSTRAINT [DF_JEHR_user_is_able_work_order_report]  DEFAULT ((0)) FOR [is_able_work_order_report]
GO

ALTER TABLE [dbo].[JEHR_user] ADD  CONSTRAINT [DF_JEHR_user_is_able_work_order_sponsor]  DEFAULT ((0)) FOR [is_able_work_order_sponsor]
GO

ALTER TABLE [dbo].[JEHR_user] ADD  CONSTRAINT [DF_JEHR_user_is_able_work_order_accept]  DEFAULT ((0)) FOR [is_able_work_order_accept]
GO

ALTER TABLE [dbo].[JEHR_user] ADD  CONSTRAINT [DF_Table_1_is_ public_work_diary]  DEFAULT ((1)) FOR [is_ public_work_diary]
GO


/* ******************************************************************************************************************* */

-- 2013-05-09

-- JEHR_project business_type_code varchar(20)

BEGIN TRANSACTION
SET QUOTED_IDENTIFIER ON
SET ARITHABORT ON
SET NUMERIC_ROUNDABORT OFF
SET CONCAT_NULL_YIELDS_NULL ON
SET ANSI_NULLS ON
SET ANSI_PADDING ON
SET ANSI_WARNINGS ON
COMMIT
BEGIN TRANSACTION
GO
ALTER TABLE dbo.JEHR_project ADD
	business_type_code varchar(20) NULL
GO
ALTER TABLE dbo.JEHR_project SET (LOCK_ESCALATION = TABLE)
GO
COMMIT

/* ******************************************************************************************************************* */

-- 2013-05-09
-- JEHR_data_dictionary

USE [BDTOA]
GO

/****** Object:  Table [dbo].[JEHR_data_dictionary]    Script Date: 2013-05-09 16:47:17 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[JEHR_data_dictionary](
	[dd_id] [int] primary key identity,
	[dictionary_name] [varchar](50) NULL,
	[dictionary_code] [varchar](20) NULL,
	[parent_code] [varchar](20) NULL,
	[is_use] [tinyint] NULL,
	[descriptions] [varchar](500) NULL
)

GO

SET ANSI_PADDING OFF
GO

ALTER TABLE [dbo].[JEHR_data_dictionary] ADD  CONSTRAINT [DF_JEHR_data_dictionary_is_use]  DEFAULT ((1)) FOR [is_use]
GO

/* ******************************************************************************************************************* */

-- 2013-05-09
-- JEHR_work_order
alter table JEHR_work_order add project_id int;
alter table JEHR_work_order drop column declarant_id;
alter table JEHR_work_order drop column declaratory_time;
alter table JEHR_work_order drop column auditor_user_id;
alter table JEHR_work_order drop column people_for_copy_id;
alter table JEHR_work_order drop column people_for_copy_name;
alter table JEHR_work_order drop column examine_time;
alter table JEHR_work_order drop column examine_status;
alter table JEHR_work_order drop column examine_opinion;
alter table JEHR_work_order add report_user_id int;
alter table JEHR_work_order add report_time datetime;
alter table JEHR_work_order add sponsor_user_id int;
alter table JEHR_work_order add accept_user_id int;
alter table JEHR_work_order add confirm_status tinyint;
alter table JEHR_work_order add confirm_time datetime;
alter table JEHR_work_order add accept_status tinyint;
alter table JEHR_work_order add accept_time datetime;
alter table JEHR_work_order add check_receive_status tinyint;
alter table JEHR_work_order add check_receive_time datetime;
alter table JEHR_work_order add invalid_reason varchar;

/* ******************************************************************************************************************* */

-- 2013-05-09
-- JEHR_work_order_copy

create table JEHR_work_order_copy(
woc_id int primary key identity,
work_order_id int,
copy_time datetime,
copy_user_id int,
is_sign_for tinyint,
sign_for_time datetime	
);

/* ******************************************************************************************************************* */

-- 2013-05-09
-- JEHR_work_diary

alter table JEHR_work_diary add report_time datetime;
alter table JEHR_work_diary add work_order_id int;
alter table JEHR_work_diary add work_type_code varchar(20);
alter table JEHR_work_diary add work_hour decimal(10, 1);

/* ******************************************************************************************************************* */

-- 2013-05-09
-- view_JEHR_user
create view view_JEHR_user as select t1.ID user_id, t1.UserName, t1.UserPwd, t1.TrueName, t1.Department, t1.ZhiWei, t1.ZaiGang, t1.EmailStr, t1.Sex,t2.ur_id, t2.is_able_work_order_report, t2.is_able_work_order_sponsor, t2.is_able_work_order_accept, t2.is_public_work_diary from view_JEHR_ERPUser t1
left join JEHR_user t2 on t1.id=t2.user_id