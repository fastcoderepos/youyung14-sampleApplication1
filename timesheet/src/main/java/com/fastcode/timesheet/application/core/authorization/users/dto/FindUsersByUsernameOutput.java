package com.fastcode.timesheet.application.core.authorization.users.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FindUsersByUsernameOutput {

  	private String emailaddress;
  	private String firstname;
  	private Long id;
  	private Boolean isactive;
  	private LocalDate joinDate;
  	private String lastname;
  	private String triggerGroup;
  	private String triggerName;
  	private String username;

}

