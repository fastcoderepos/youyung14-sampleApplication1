package com.fastcode.timesheet.application.core.timesheetstatus.dto;

import java.time.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateTimesheetstatusInput {

  	@NotNull(message = "id Should not be null")
  	private Long id;
  	
  	@NotNull(message = "statusname Should not be null")
 	@Length(max = 255, message = "statusname must be less than 255 characters")
  	private String statusname;
  	
  	private Long versiono;
  
}

