package com.fastcode.timesheet.application.core.usertask.dto;

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
  	private Long usertaskTaskid;
  	private Long usertaskUserid;

}

