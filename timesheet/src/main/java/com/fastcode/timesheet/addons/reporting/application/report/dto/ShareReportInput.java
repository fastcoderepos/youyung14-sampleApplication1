package com.fastcode.timesheet.addons.reporting.application.report.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class ShareReportInput {
	
	private List<ShareReportInputByRole> rolesList;
	private List<ShareReportInputByUser> usersList;

}
