package com.fastcode.timesheet.application.core.timeofftype.dto;

import java.time.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateTimeofftypeInput {

  	@NotNull(message = "typename Should not be null")
  	@Length(max = 255, message = "typename must be less than 255 characters")
  	private String typename;
  

}

