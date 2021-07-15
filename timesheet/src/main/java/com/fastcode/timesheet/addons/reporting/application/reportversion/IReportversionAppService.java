package com.fastcode.timesheet.addons.reporting.application.reportversion;

import java.util.List;
import java.util.Map;
import java.time.*;

import org.springframework.data.domain.Pageable;

import com.fastcode.timesheet.addons.reporting.application.reportversion.dto.*;
import com.fastcode.timesheet.commons.search.SearchCriteria;
import com.fastcode.timesheet.addons.reporting.domain.reportversion.ReportversionId;

public interface IReportversionAppService {
	
	CreateReportversionOutput create(CreateReportversionInput report);

    void delete(ReportversionId id);

    UpdateReportversionOutput update(ReportversionId id, UpdateReportversionInput input);

    FindReportversionByIdOutput findById(ReportversionId id);

    List<FindReportversionByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
  
    GetUsersOutput getUsers(ReportversionId reportid);
    
    List<FindReportversionByIdOutput> findByUsersId( Long userId);
  
    Map<String,String> parsedashboardversionreportJoinColumn(String keysString);

}

