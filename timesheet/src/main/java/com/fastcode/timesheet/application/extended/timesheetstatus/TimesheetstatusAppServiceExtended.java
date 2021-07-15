package com.fastcode.timesheet.application.extended.timesheetstatus;

import org.springframework.stereotype.Service;
import com.fastcode.timesheet.application.core.timesheetstatus.TimesheetstatusAppService;

import com.fastcode.timesheet.domain.extended.timesheetstatus.ITimesheetstatusRepositoryExtended;
import com.fastcode.timesheet.commons.logging.LoggingHelper;

@Service("timesheetstatusAppServiceExtended")
public class TimesheetstatusAppServiceExtended extends TimesheetstatusAppService implements ITimesheetstatusAppServiceExtended {

	public TimesheetstatusAppServiceExtended(ITimesheetstatusRepositoryExtended timesheetstatusRepositoryExtended,
				ITimesheetstatusMapperExtended mapper,LoggingHelper logHelper) {

		super(timesheetstatusRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

