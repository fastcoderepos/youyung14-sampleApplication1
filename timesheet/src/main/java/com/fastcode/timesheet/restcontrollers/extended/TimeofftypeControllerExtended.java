package com.fastcode.timesheet.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.timesheet.restcontrollers.core.TimeofftypeController;
import com.fastcode.timesheet.application.extended.timeofftype.ITimeofftypeAppServiceExtended;
import com.fastcode.timesheet.application.extended.timesheetdetails.ITimesheetdetailsAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.timesheet.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/timeofftype/extended")
public class TimeofftypeControllerExtended extends TimeofftypeController {

		public TimeofftypeControllerExtended(ITimeofftypeAppServiceExtended timeofftypeAppServiceExtended, ITimesheetdetailsAppServiceExtended timesheetdetailsAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		timeofftypeAppServiceExtended,
    	timesheetdetailsAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

