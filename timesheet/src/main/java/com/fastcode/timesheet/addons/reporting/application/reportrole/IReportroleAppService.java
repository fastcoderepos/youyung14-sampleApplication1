package com.fastcode.timesheet.addons.reporting.application.reportrole;

import java.util.List;
import java.util.Map;

import com.fastcode.timesheet.addons.reporting.domain.reportrole.QReportrole;
import com.fastcode.timesheet.addons.reporting.domain.report.Report;
import com.fastcode.timesheet.addons.reporting.domain.reportrole.ReportroleId;
import com.fastcode.timesheet.domain.core.authorization.role.Role;
import com.querydsl.core.BooleanBuilder;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.fastcode.timesheet.commons.search.SearchCriteria;
import com.fastcode.timesheet.commons.search.SearchFields;
import com.fastcode.timesheet.addons.reporting.application.reportrole.dto.*;

@Service
public interface IReportroleAppService {

	public CreateReportroleOutput create(CreateReportroleInput reportrole);

    public void delete(ReportroleId reportroleId);
    
    public Boolean addReportsToRole(Role role, List<Report> reportsList);

    public UpdateReportroleOutput update(ReportroleId reportroleId, UpdateReportroleInput input);

    public FindReportroleByIdOutput findById(ReportroleId reportroleId);

    public List<FindReportroleByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
    
    public BooleanBuilder search(SearchCriteria search) throws Exception;
    
    public void checkProperties(List<String> list) throws Exception;
    
    public BooleanBuilder searchKeyValuePair(QReportrole reportrole, Map<String,SearchFields> map,Map<String,String> joinColumns);

	public ReportroleId parseReportroleKey(String keysString);
    
    //Report
    public GetReportOutput getReport(ReportroleId reportroleId);
}

