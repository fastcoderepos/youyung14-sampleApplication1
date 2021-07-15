package com.fastcode.timesheet.application.core.timesheetdetails.dto;

import java.time.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateTimesheetdetailsInput {

  	private Double hours;
  	
  	@NotNull(message = "id Should not be null")
  	private Long id;
  	
 	@Length(max = 255, message = "notes must be less than 255 characters")
  	private String notes;
  	
  	@NotNull(message = "workdate Should not be null")
  	private LocalDate workdate;
  	
  	private Long taskid;
  	private Long timeofftypeid;
  	private Long timesheetid;
  	private Long versiono;
  
}

