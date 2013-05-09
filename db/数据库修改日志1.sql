
/* ******************************************************************************************************************* */

-- 2013-05-09

-- 创建表 JEHR_user 

USE [BDTOA]
GO

/****** Object:  Table [dbo].[JEHR_user]    Script Date: 2013-05-09 16:24:54 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[JEHR_user](
	[u_id] [int] NOT NULL,
	[user_id] [int] NULL,
	[is_able_work_order_report] [tinyint] NULL,
	[is_able_work_order_sponsor] [tinyint] NULL,
	[is_able_work_order_accept] [tinyint] NULL,
	[is_ public_work_diary] [tinyint] NULL,
 CONSTRAINT [PK_JEHR_user] PRIMARY KEY CLUSTERED 
(
	[u_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

ALTER TABLE [dbo].[JEHR_user] ADD  CONSTRAINT [DF_JEHR_user_is_able_work_order_report]  DEFAULT ((0)) FOR [is_able_work_order_report]
GO

ALTER TABLE [dbo].[JEHR_user] ADD  CONSTRAINT [DF_JEHR_user_is_able_work_order_sponsor]  DEFAULT ((0)) FOR [is_able_work_order_sponsor]
GO

ALTER TABLE [dbo].[JEHR_user] ADD  CONSTRAINT [DF_JEHR_user_is_able_work_order_accept]  DEFAULT ((0)) FOR [is_able_work_order_accept]
GO

ALTER TABLE [dbo].[JEHR_user] ADD  CONSTRAINT [DF_Table_1_is_ public_work_diary]  DEFAULT ((1)) FOR [is_ public_work_diary]
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'员工ID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'JEHR_user', @level2type=N'COLUMN',@level2name=N'user_id'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否具备工单填报权限，是1，否0，默认0' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'JEHR_user', @level2type=N'COLUMN',@level2name=N'is_able_work_order_report'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否具备工单发起权限，是1，否0，默认0' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'JEHR_user', @level2type=N'COLUMN',@level2name=N'is_able_work_order_sponsor'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否具备工单受理权限，是1，否0，默认0' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'JEHR_user', @level2type=N'COLUMN',@level2name=N'is_able_work_order_accept'
GO

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'是否公开个人工作日志，是1，否0，默认1' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'JEHR_user', @level2type=N'COLUMN',@level2name=N'is_ public_work_diary'
GO

/* ******************************************************************************************************************* */

-- 2013-05-09

-- 表JEHR_project 添加一个字段 business_type_code varchar(20)

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
-- 创建数据字典表 JEHR_data_dictionary

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
	[d_id] [int] NULL,
	[dictionary_name] [varchar](50) NULL,
	[dictionary_code] [varchar](20) NULL,
	[parent_code] [varchar](20) NULL,
	[is_use] [tinyint] NULL,
	[descriptions] [varchar](500) NULL
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

ALTER TABLE [dbo].[JEHR_data_dictionary] ADD  CONSTRAINT [DF_JEHR_data_dictionary_is_use]  DEFAULT ((1)) FOR [is_use]
GO
