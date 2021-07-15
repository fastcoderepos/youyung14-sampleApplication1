package com.fastcode.timesheet.addons.reporting.application.reportuser;

import java.util.List;
import java.util.Map;

import com.fastcode.timesheet.addons.reporting.domain.reportuser.QReportuser;
import com.fastcode.timesheet.addons.reporting.domain.report.Report;
import com.fastcode.timesheet.addons.reporting.domain.reportuser.ReportuserId;
import com.fastcode.timesheet.domain.core.authorization.users.Users;
import com.querydsl.core.BooleanBuilder;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.fastcode.timesheet.commons.search.SearchCriteria;
import com.fastcode.timesheet.commons.search.SearchFields;
import com.fastcode.timesheet.addons.reporting.application.reportuser.dto.*;

@Service
public interface IReportuserAppService {

	public CreateReportuserOutput create(CreateReportuserInput reportuser);
	
	public Boolean addReportsToUsers(Users users, List<Report> reportsList);

    public void delete(ReportuserId reportuserId);

    public UpdateReportuserOutput update(ReportuserId reportuserId, UpdateReportuserInput input);

    public FindReportuserByIdOutput findById(ReportuserId reportuserId);

    public List<FindReportuserByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;

    public GetReportOutput getReport(ReportuserId reportuserId);
    
    public BooleanBuilder search(SearchCriteria search) throws Exception;
    
    public void checkProperties(List<String> list) throws Exception;
    
    public BooleanBuilder searchKeyValuePair(QReportuser reportuser, Map<String,SearchFields> map,Map<String,String> joinColumns);
    
    public ReportuserId parseReportuserKey(String keysString);
}

