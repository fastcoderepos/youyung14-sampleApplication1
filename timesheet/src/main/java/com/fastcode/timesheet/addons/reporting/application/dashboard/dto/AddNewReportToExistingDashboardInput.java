package com.fastcode.timesheet.addons.reporting.application.dashboard.dto;

import java.util.ArrayList;
import java.util.List;

import com.fastcode.timesheet.addons.reporting.application.report.dto.CreateReportInput;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AddNewReportToExistingDashboardInput {
	
	private Long id;
	private String description;
	private String title;
  	private Long ownerId; 
    private Boolean isPublished;
	List<CreateReportInput> reportDetails= new ArrayList<>();

}

