package com.fastcode.timesheet.application.core.timesheetdetails;

import org.springframework.data.domain.Pageable;
import com.fastcode.timesheet.application.core.timesheetdetails.dto.*;
import com.fastcode.timesheet.commons.search.SearchCriteria;

import java.util.*;

public interface ITimesheetdetailsAppService {
	
	//CRUD Operations
	
	CreateTimesheetdetailsOutput create(CreateTimesheetdetailsInput timesheetdetails);

    void delete(Long id);

    UpdateTimesheetdetailsOutput update(Long id, UpdateTimesheetdetailsInput input);

    FindTimesheetdetailsByIdOutput findById(Long id);

    List<FindTimesheetdetailsByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
	//Relationship Operations
	//Relationship Operations
	//Relationship Operations
    
    GetTaskOutput getTask(Long timesheetdetailsid);
    
    GetTimeofftypeOutput getTimeofftype(Long timesheetdetailsid);
    
    GetTimesheetOutput getTimesheet(Long timesheetdetailsid);
    
    //Join Column Parsers
}

