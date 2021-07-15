package com.fastcode.timesheet.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.timesheet.restcontrollers.core.TimesheetController;
import com.fastcode.timesheet.application.extended.timesheet.ITimesheetAppServiceExtended;
import com.fastcode.timesheet.application.extended.timesheetdetails.ITimesheetdetailsAppServiceExtended;
import com.fastcode.timesheet.application.extended.timesheetstatus.ITimesheetstatusAppServiceExtended;
import com.fastcode.timesheet.application.extended.authorization.users.IUsersAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.timesheet.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/timesheet/extended")
public class TimesheetControllerExtended extends TimesheetController {

		public TimesheetControllerExtended(ITimesheetAppServiceExtended timesheetAppServiceExtended, ITimesheetdetailsAppServiceExtended timesheetdetailsAppServiceExtended, ITimesheetstatusAppServiceExtended timesheetstatusAppServiceExtended, IUsersAppServiceExtended usersAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		timesheetAppServiceExtended,
    	timesheetdetailsAppServiceExtended,
    	timesheetstatusAppServiceExtended,
    	usersAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

