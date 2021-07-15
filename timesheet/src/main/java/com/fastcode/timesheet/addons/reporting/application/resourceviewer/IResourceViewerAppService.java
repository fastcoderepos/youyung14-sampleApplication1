package com.fastcode.timesheet.addons.reporting.application.resourceviewer;

import com.fastcode.timesheet.addons.reporting.application.permalink.dto.*;
import com.fastcode.timesheet.addons.reporting.application.resourceviewer.dto.ResourceOutput;

public interface IResourceViewerAppService {

	public ResourceOutput getData(FindPermalinkByIdOutput output);
	boolean isAuthorized(FindPermalinkByIdOutput output, String password);

}


