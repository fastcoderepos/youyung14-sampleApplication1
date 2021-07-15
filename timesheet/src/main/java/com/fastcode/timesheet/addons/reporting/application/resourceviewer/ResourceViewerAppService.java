package com.fastcode.timesheet.addons.reporting.application.resourceviewer;

import com.fastcode.timesheet.application.extended.authorization.users.IUsersAppServiceExtended;
import com.fastcode.timesheet.addons.reporting.application.dashboard.IDashboardAppService;
import com.fastcode.timesheet.addons.reporting.application.dashboard.dto.FindDashboardByIdOutput;
import com.fastcode.timesheet.addons.reporting.application.permalink.dto.*;
import com.fastcode.timesheet.addons.reporting.application.report.IReportAppService;
import com.fastcode.timesheet.addons.reporting.application.report.dto.FindReportByIdOutput;
import com.fastcode.timesheet.addons.reporting.application.resourceviewer.dto.ResourceOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Qualifier;

@Service
@Validated
public class ResourceViewerAppService implements IResourceViewerAppService {

	@Autowired
	@Qualifier("usersAppServiceExtended")
	private IUsersAppServiceExtended _usersAppService;

	@Autowired
	private PasswordEncoder pEncoder;

	@Autowired
	@Qualifier("reportAppService")
	private IReportAppService _reportAppService;

	@Autowired
	@Qualifier("dashboardAppService")
	private IDashboardAppService _dashboardAppService;

	public ResourceOutput getData(FindPermalinkByIdOutput permalink){
		ResourceOutput data = new ResourceOutput();
		data.setResourceInfo(permalink);

		if(permalink.getResource().equals("report")) {
			FindReportByIdOutput report = _reportAppService.findById(permalink.getResourceId());
			if(report == null) {
				return null;
			}
			data.setData(report);
		}
		else if(permalink.getResource().equals("dashboard")) {
			FindDashboardByIdOutput dashboard = _dashboardAppService.findById(permalink.getResourceId());
			if(dashboard == null) {
				return null;
			}
			dashboard.setReportDetails(_dashboardAppService.setReportsList(permalink.getResourceId(),permalink.getUserId() , "published"));
			data.setData(dashboard);
		}
		return data;
	}

	public boolean isAuthorized(FindPermalinkByIdOutput output, String password) {
		if(output.getAuthentication() == "login") {
			if(_usersAppService.getUsers() == null) {
				return false;
			}
		}

		else if (output.getAuthentication() == "password") {
			if(!pEncoder.matches(password, output.getPassword())) {
				return false;
			}
		}

		return true;
	}

}




