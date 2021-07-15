package com.fastcode.timesheet.addons.reporting.application.dashboardversionreport;

import java.util.List;
import java.time.*;

import com.fastcode.timesheet.addons.reporting.domain.dashboard.Dashboard;
import com.fastcode.timesheet.addons.reporting.domain.dashboardversionreport.DashboardversionreportId;
import com.fastcode.timesheet.addons.reporting.domain.report.Report;

import org.springframework.data.domain.Pageable;

import com.fastcode.timesheet.addons.reporting.application.dashboard.dto.CreateDashboardOutput;
import com.fastcode.timesheet.addons.reporting.application.dashboardversionreport.dto.*;
import com.fastcode.timesheet.addons.reporting.application.report.dto.CreateReportOutput;
import com.fastcode.timesheet.commons.search.SearchCriteria;

public interface IDashboardversionreportAppService {

	CreateDashboardversionreportOutput create(CreateDashboardversionreportInput reportdashboard);

    void delete(DashboardversionreportId reportdashboardId);
    
    Boolean addReportsToDashboard(Dashboard dashboard, List<Report> reportsList);

    UpdateDashboardversionreportOutput update(DashboardversionreportId reportdashboardId, UpdateDashboardversionreportInput input);

    FindDashboardversionreportByIdOutput findById(DashboardversionreportId reportdashboardId);
    
    Boolean addReportsToDashboardRunningversion(CreateDashboardOutput dashboard, List<CreateReportOutput> reportsList);

    Boolean addReportsToDashboardPublishedversion(CreateDashboardOutput dashboard, List<CreateReportOutput> reportsList);
    
    List<FindDashboardversionreportByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;

	DashboardversionreportId parseReportdashboardKey(String keysString);
    
    //Dashboard
    GetDashboardversionOutput getDashboard(DashboardversionreportId reportdashboardId);
    
    //Report
    GetReportOutput getReport(DashboardversionreportId reportdashboardId);
}

