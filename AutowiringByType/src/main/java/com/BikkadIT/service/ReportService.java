package com.BikkadIT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.dao.ReportDaoI;
@Service
public class ReportService {
	@Autowired
	private ReportDaoI reportDaoI;
	
public void generateReport() {
		
		String reportData = reportDaoI.getReportData();
		System.out.println(reportData);
	}
}
