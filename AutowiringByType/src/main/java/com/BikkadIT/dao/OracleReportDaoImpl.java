package com.BikkadIT.dao;

import org.springframework.stereotype.Repository;

@Repository("reportDaoI")
public class OracleReportDaoImpl implements ReportDaoI{

	@Override
	public String getReportData() {
		String msg="Getting data from Oracle dataBase";
		// TODO Auto-generated method stub
		return msg;
	}

}
