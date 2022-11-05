package com.BikkadIT.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MysqlReportDaoImpl implements ReportDaoI{

	@Override
	public String getReportData() {
		String msg="Getting data from Mysql dataBase";
		// TODO Auto-generated method stub
		return msg;
	}

}
