package com.fastcode.timesheet.application.core.timesheet.dto;

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
 	private String password;
 	private String triggerGroup;
 	private String triggerName;
 	private String username;
  	private Long timesheetId;

}

