package com.fastcode.timesheet.addons.reporting.application.reportversion;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.time.*;
import com.fastcode.timesheet.addons.reporting.application.reportversion.dto.CreateReportversionInput;
import com.fastcode.timesheet.addons.reporting.application.reportversion.dto.CreateReportversionOutput;
import com.fastcode.timesheet.addons.reporting.application.reportversion.dto.FindReportversionByIdOutput;
import com.fastcode.timesheet.addons.reporting.application.reportversion.dto.GetUsersOutput;
import com.fastcode.timesheet.addons.reporting.application.reportversion.dto.UpdateReportversionInput;
import com.fastcode.timesheet.addons.reporting.application.reportversion.dto.UpdateReportversionOutput;
import com.fastcode.timesheet.addons.reporting.domain.reportversion.Reportversion;
import com.fastcode.timesheet.domain.core.authorization.users.Users;


@Mapper(componentModel = "spring")
public interface IReportversionMapper {
	Reportversion createReportversionInputToReportversion(CreateReportversionInput reportversionDto);

	@Mappings({ 
		@Mapping(source = "userId", target = "userId"),
   		@Mapping(source = "users.username", target = "userDescriptiveField"),   
		@Mapping(source = "report.id", target = "reportId")
		
	}) 
	CreateReportversionOutput reportversionToCreateReportversionOutput(Reportversion entity);

	@Mappings({ 
		@Mapping(source = "userId", target = "userId"),
		@Mapping(source = "version", target = "reportVersion")
	}) 
	Reportversion reportversionToReportversion(Reportversion entity,Long userId, String version);

	Reportversion updateReportversionInputToReportversion(UpdateReportversionInput reportversionDto);

	@Mappings({  
		@Mapping(source = "userId", target = "userId"),
   		@Mapping(source = "users.username", target = "userDescriptiveField"),   
		@Mapping(source = "report.id", target = "reportId")                   
	}) 
	UpdateReportversionOutput reportversionToUpdateReportversionOutput(Reportversion entity);

	@Mappings({ 
		@Mapping(source = "userId", target = "userId"),
   		@Mapping(source = "users.username", target = "userDescriptiveField"),   
		@Mapping(source = "report.id", target = "reportId")                  
	}) 
	FindReportversionByIdOutput reportversionToFindReportversionByIdOutput(Reportversion entity);


	@Mappings({
		@Mapping(source = "users.id", target = "id"),
		@Mapping(source = "reportversion.reportVersion", target = "reportVersion"),
	})
	GetUsersOutput usersToGetUsersOutput(Users users, Reportversion reportversion);

}
