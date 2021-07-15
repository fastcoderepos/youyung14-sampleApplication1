package com.fastcode.timesheet.application.core.authorization.userspermission.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GetUsersOutput {

 	private String firstname;
 	private Boolean isactive;
 	private String emailaddress;
 	private String lastname;
 	private String password;
 	private Long id;
 	private String username;
  	private Long userspermissionPermissionId;
  	private Long userspermissionUsersId;

}

