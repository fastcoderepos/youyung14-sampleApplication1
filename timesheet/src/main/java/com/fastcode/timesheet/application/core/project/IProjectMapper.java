package com.fastcode.timesheet.application.core.project;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.fastcode.timesheet.domain.core.customer.Customer;
import com.fastcode.timesheet.application.core.project.dto.*;
import com.fastcode.timesheet.domain.core.project.Project;
import java.time.*;

@Mapper(componentModel = "spring")
public interface IProjectMapper {

   Project createProjectInputToProject(CreateProjectInput projectDto);
   
   @Mappings({ 
   @Mapping(source = "entity.customer.customerid", target = "customerid"),                   
   @Mapping(source = "entity.customer.customerid", target = "customerDescriptiveField"),                    
   }) 
   CreateProjectOutput projectToCreateProjectOutput(Project entity);
   
    Project updateProjectInputToProject(UpdateProjectInput projectDto);
    
    @Mappings({ 
    @Mapping(source = "entity.customer.customerid", target = "customerid"),                   
    @Mapping(source = "entity.customer.customerid", target = "customerDescriptiveField"),                    
   	}) 
   	UpdateProjectOutput projectToUpdateProjectOutput(Project entity);

   	@Mappings({ 
   	@Mapping(source = "entity.customer.customerid", target = "customerid"),                   
   	@Mapping(source = "entity.customer.customerid", target = "customerDescriptiveField"),                    
   	}) 
   	FindProjectByIdOutput projectToFindProjectByIdOutput(Project entity);


   @Mappings({
   @Mapping(source = "customer.description", target = "description"),                  
   @Mapping(source = "customer.name", target = "name"),                  
   @Mapping(source = "foundProject.id", target = "projectId"),
   })
   GetCustomerOutput customerToGetCustomerOutput(Customer customer, Project foundProject);
   
}

