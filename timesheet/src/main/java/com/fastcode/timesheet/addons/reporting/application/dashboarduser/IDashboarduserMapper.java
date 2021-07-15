package com.fastcode.timesheet.addons.reporting.application.dashboarduser;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.fastcode.timesheet.addons.reporting.application.dashboarduser.dto.*;
import com.fastcode.timesheet.addons.reporting.domain.dashboard.Dashboard;
import com.fastcode.timesheet.addons.reporting.domain.dashboarduser.Dashboarduser;

@Mapper(componentModel = "spring")
public interface IDashboarduserMapper {

	Dashboarduser createDashboarduserInputToDashboarduser(CreateDashboarduserInput dashboarduserDto);

	@Mappings({ 
		@Mapping(source = "userId", target = "userId"),
   		@Mapping(source = "users.username", target = "userDescriptiveField"),   
		@Mapping(source = "dashboardId", target = "dashboardId")                                  
	}) 
	CreateDashboarduserOutput dashboarduserToCreateDashboarduserOutput(Dashboarduser entity);

	Dashboarduser updateDashboarduserInputToDashboarduser(UpdateDashboarduserInput dashboarduserDto);

	@Mappings({ 
		@Mapping(source = "userId", target = "userId"),
   		@Mapping(source = "users.username", target = "userDescriptiveField"),   
		@Mapping(source = "dashboardId", target = "dashboardId")                 
	}) 
	UpdateDashboarduserOutput dashboarduserToUpdateDashboarduserOutput(Dashboarduser entity);

	@Mappings({ 
		@Mapping(source = "userId", target = "userId"),
   		@Mapping(source = "users.username", target = "userDescriptiveField"),   
		@Mapping(source = "dashboardId", target = "dashboardId")                  
	}) 
	FindDashboarduserByIdOutput dashboarduserToFindDashboarduserByIdOutput(Dashboarduser entity);

	@Mappings({
		@Mapping(source = "dashboarduser.userId", target = "dashboarduserUserId")	})
	GetDashboardOutput dashboardToGetDashboardOutput(Dashboard dashboard, Dashboarduser dashboarduser);

}

