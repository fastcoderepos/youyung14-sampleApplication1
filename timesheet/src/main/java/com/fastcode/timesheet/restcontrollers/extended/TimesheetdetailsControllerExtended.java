package com.fastcode.timesheet.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.timesheet.restcontrollers.core.TimesheetdetailsController;
import com.fastcode.timesheet.application.extended.timesheetdetails.ITimesheetdetailsAppServiceExtended;
import com.fastcode.timesheet.application.extended.task.ITaskAppServiceExtended;
import com.fastcode.timesheet.application.extended.timeofftype.ITimeofftypeAppServiceExtended;
import com.fastcode.timesheet.application.extended.timesheet.ITimesheetAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.timesheet.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/timesheetdetails/extended")
public class TimesheetdetailsControllerExtended extends TimesheetdetailsController {

		public TimesheetdetailsControllerExtended(ITimesheetdetailsAppServiceExtended timesheetdetailsAppServiceExtended, ITaskAppServiceExtended taskAppServiceExtended, ITimeofftypeAppServiceExtended timeofftypeAppServiceExtended, ITimesheetAppServiceExtended timesheetAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		timesheetdetailsAppServiceExtended,
    	taskAppServiceExtended,
    	timeofftypeAppServiceExtended,
    	timesheetAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

