package com.fastcode.timesheet.application.core.project.dto;

import java.time.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateProjectInput {

  	@Length(max = 255, message = "description must be less than 255 characters")
  	private String description;
  
  	@NotNull(message = "enddate Should not be null")
  	private LocalDate enddate;
  
  	@NotNull(message = "name Should not be null")
  	@Length(max = 255, message = "name must be less than 255 characters")
  	private String name;
  
  	@NotNull(message = "startdate Should not be null")
  	private LocalDate startdate;
  
  	private Long customerid;

}

