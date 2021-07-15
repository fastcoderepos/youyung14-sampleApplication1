package com.fastcode.timesheet.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.timesheet.restcontrollers.core.TimesheetstatusController;
import com.fastcode.timesheet.application.extended.timesheetstatus.ITimesheetstatusAppServiceExtended;
import com.fastcode.timesheet.application.extended.timesheet.ITimesheetAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.timesheet.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/timesheetstatus/extended")
public class TimesheetstatusControllerExtended extends TimesheetstatusController {

		public TimesheetstatusControllerExtended(ITimesheetstatusAppServiceExtended timesheetstatusAppServiceExtended, ITimesheetAppServiceExtended timesheetAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		timesheetstatusAppServiceExtended,
    	timesheetAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

