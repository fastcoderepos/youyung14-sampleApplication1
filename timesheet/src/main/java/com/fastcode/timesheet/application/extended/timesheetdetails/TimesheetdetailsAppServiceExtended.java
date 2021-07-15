package com.fastcode.timesheet.application.extended.timesheetdetails;

import org.springframework.stereotype.Service;
import com.fastcode.timesheet.application.core.timesheetdetails.TimesheetdetailsAppService;

import com.fastcode.timesheet.domain.extended.timesheetdetails.ITimesheetdetailsRepositoryExtended;
import com.fastcode.timesheet.domain.extended.task.ITaskRepositoryExtended;
import com.fastcode.timesheet.domain.extended.timeofftype.ITimeofftypeRepositoryExtended;
import com.fastcode.timesheet.domain.extended.timesheet.ITimesheetRepositoryExtended;
import com.fastcode.timesheet.commons.logging.LoggingHelper;

@Service("timesheetdetailsAppServiceExtended")
public class TimesheetdetailsAppServiceExtended extends TimesheetdetailsAppService implements ITimesheetdetailsAppServiceExtended {

	public TimesheetdetailsAppServiceExtended(ITimesheetdetailsRepositoryExtended timesheetdetailsRepositoryExtended,
				ITaskRepositoryExtended taskRepositoryExtended,ITimeofftypeRepositoryExtended timeofftypeRepositoryExtended,ITimesheetRepositoryExtended timesheetRepositoryExtended,ITimesheetdetailsMapperExtended mapper,LoggingHelper logHelper) {

		super(timesheetdetailsRepositoryExtended,
		taskRepositoryExtended,timeofftypeRepositoryExtended,timesheetRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

