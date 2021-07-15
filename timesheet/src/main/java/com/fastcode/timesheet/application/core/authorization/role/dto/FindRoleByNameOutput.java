package com.fastcode.timesheet.application.core.authorization.role.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FindRoleByNameOutput {

  	private String displayName;
  	private Long id;
  	private String name;
 
}

