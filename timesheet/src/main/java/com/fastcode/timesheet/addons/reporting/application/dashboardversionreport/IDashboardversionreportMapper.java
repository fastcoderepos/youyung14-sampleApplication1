package com.fastcode.timesheet.addons.reporting.application.dashboardversionreport;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.time.*;

import com.fastcode.timesheet.addons.reporting.application.dashboardversionreport.dto.*;
import com.fastcode.timesheet.addons.reporting.domain.dashboardversion.Dashboardversion;
import com.fastcode.timesheet.addons.reporting.domain.report.Report;
import com.fastcode.timesheet.addons.reporting.domain.dashboardversionreport.Dashboardversionreport;

@Mapper(componentModel = "spring")
public interface IDashboardversionreportMapper {

   Dashboardversionreport createReportdashboardInputToDashboardversionreport(CreateDashboardversionreportInput reportdashboardDto);
   
   @Mappings({ 
   @Mapping(source = "dashboardId", target = "dashboardId"),
   @Mapping(source = "reportId", target = "reportId")                 
   }) 
   CreateDashboardversionreportOutput reportdashboardToCreateReportdashboardOutput(Dashboardversionreport entity);

   Dashboardversionreport updateReportdashboardInputToDashboardversionreport(UpdateDashboardversionreportInput reportdashboardDto);

   @Mappings({ 
   @Mapping(source = "dashboardId", target = "dashboardId"),
   @Mapping(source = "reportId", target = "reportId")                   
   }) 
   UpdateDashboardversionreportOutput reportdashboardToUpdateReportdashboardOutput(Dashboardversionreport entity);


   FindDashboardversionreportByIdOutput reportdashboardToFindReportdashboardByIdOutput(Dashboardversionreport entity);


   @Mappings({
   @Mapping(source = "reportdashboard.dashboardId", target = "reportdashboardDashboardId"),
   @Mapping(source = "reportdashboard.reportId", target = "reportdashboardReportId"),
   })
   GetDashboardversionOutput dashboardversionToGetDashboardversionOutput(Dashboardversion dashboardversion, Dashboardversionreport reportdashboard);

   @Mappings({
   @Mapping(source = "reportdashboard.dashboardId", target = "reportdashboardDashboardId"),
   @Mapping(source = "reportdashboard.reportId", target = "reportdashboardReportId"),
   })
   GetReportOutput reportToGetReportOutput(Report report, Dashboardversionreport reportdashboard);

}

