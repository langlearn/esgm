package com.dj.common.mybatis.dialect;

public abstract class Dialect {

	public static enum Type{
		MYSQL,
		ORACLE,
		SQLSERVER2005, 
		SQLSERVER2008
	}
	
	public abstract String getLimitString(String sql, int skipResults, int maxResults);
	
}
