package com.fastcode.timesheet.application.extended.timesheet;

import org.springframework.stereotype.Service;
import com.fastcode.timesheet.application.core.timesheet.TimesheetAppService;

import com.fastcode.timesheet.domain.extended.timesheet.ITimesheetRepositoryExtended;
import com.fastcode.timesheet.domain.extended.timesheetstatus.ITimesheetstatusRepositoryExtended;
import com.fastcode.timesheet.domain.extended.authorization.users.IUsersRepositoryExtended;
import com.fastcode.timesheet.commons.logging.LoggingHelper;

@Service("timesheetAppServiceExtended")
public class TimesheetAppServiceExtended extends TimesheetAppService implements ITimesheetAppServiceExtended {

	public TimesheetAppServiceExtended(ITimesheetRepositoryExtended timesheetRepositoryExtended,
				ITimesheetstatusRepositoryExtended timesheetstatusRepositoryExtended,IUsersRepositoryExtended usersRepositoryExtended,ITimesheetMapperExtended mapper,LoggingHelper logHelper) {

		super(timesheetRepositoryExtended,
		timesheetstatusRepositoryExtended,usersRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

