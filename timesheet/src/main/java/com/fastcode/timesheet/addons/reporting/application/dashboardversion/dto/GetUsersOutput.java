package com.fastcode.timesheet.addons.reporting.application.dashboardversion.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GetUsersOutput {
	
    private String emailaddress;
    private String firstname;
    private Long id;
    private Boolean isactive;
    private LocalDate joinDate;
    private String lastname;
    private String triggerGroup;
    private String triggerName;
    private String username;

   	private String dashboardVersion;
	private Long dashboardversionId;

}
