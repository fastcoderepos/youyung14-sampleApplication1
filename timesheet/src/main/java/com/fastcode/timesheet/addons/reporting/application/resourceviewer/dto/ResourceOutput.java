package com.fastcode.timesheet.addons.reporting.application.resourceviewer.dto;

import com.fastcode.timesheet.addons.reporting.application.permalink.dto.FindPermalinkByIdOutput;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ResourceOutput {

	FindPermalinkByIdOutput resourceInfo;
	Object data;

}

