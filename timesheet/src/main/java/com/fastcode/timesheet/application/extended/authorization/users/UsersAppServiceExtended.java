package com.fastcode.timesheet.application.extended.authorization.users;

import org.springframework.stereotype.Service;
import com.fastcode.timesheet.application.core.authorization.users.UsersAppService;

import com.fastcode.timesheet.domain.extended.authorization.users.IUsersRepositoryExtended;
import com.fastcode.timesheet.domain.core.authorization.userspreference.IUserspreferenceRepository;
import com.fastcode.timesheet.addons.reporting.domain.dashboarduser.IDashboarduserRepository;
import com.fastcode.timesheet.addons.reporting.domain.reportuser.IReportuserRepository;
import com.fastcode.timesheet.addons.reporting.domain.dashboardversion.*;
import com.fastcode.timesheet.addons.reporting.domain.dashboardversionreport.*;
import com.fastcode.timesheet.addons.reporting.domain.reportversion.*;
import com.fastcode.timesheet.commons.logging.LoggingHelper;

@Service("usersAppServiceExtended")
public class UsersAppServiceExtended extends UsersAppService implements IUsersAppServiceExtended {

	public UsersAppServiceExtended(IDashboarduserRepository dashboarduserRepository,IReportuserRepository reportuserRepository,IDashboardversionRepository dashboardversionRepository,IReportversionRepository reportversionRepository,IDashboardversionreportRepository reportDashboardRepository,IUsersRepositoryExtended usersRepositoryExtended,
				IUserspreferenceRepository userspreferenceRepository,IUsersMapperExtended mapper,LoggingHelper logHelper) {

		super(dashboarduserRepository,reportuserRepository,dashboardversionRepository,reportversionRepository,reportDashboardRepository,usersRepositoryExtended,
		userspreferenceRepository,mapper,logHelper);

	}

 	//Add your custom code here
 
}

