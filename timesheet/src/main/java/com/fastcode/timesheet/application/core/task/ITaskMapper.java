package com.fastcode.timesheet.application.core.task;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.fastcode.timesheet.domain.core.project.Project;
import com.fastcode.timesheet.application.core.task.dto.*;
import com.fastcode.timesheet.domain.core.task.Task;
import java.time.*;

@Mapper(componentModel = "spring")
public interface ITaskMapper {

   Task createTaskInputToTask(CreateTaskInput taskDto);
   
   @Mappings({ 
   @Mapping(source = "entity.project.id", target = "projectid"),                   
   @Mapping(source = "entity.project.id", target = "projectDescriptiveField"),                    
   }) 
   CreateTaskOutput taskToCreateTaskOutput(Task entity);
   
    Task updateTaskInputToTask(UpdateTaskInput taskDto);
    
    @Mappings({ 
    @Mapping(source = "entity.project.id", target = "projectid"),                   
    @Mapping(source = "entity.project.id", target = "projectDescriptiveField"),                    
   	}) 
   	UpdateTaskOutput taskToUpdateTaskOutput(Task entity);

   	@Mappings({ 
   	@Mapping(source = "entity.project.id", target = "projectid"),                   
   	@Mapping(source = "entity.project.id", target = "projectDescriptiveField"),                    
   	}) 
   	FindTaskByIdOutput taskToFindTaskByIdOutput(Task entity);


   @Mappings({
   @Mapping(source = "project.description", target = "description"),                  
   @Mapping(source = "project.id", target = "id"),                  
   @Mapping(source = "project.name", target = "name"),                  
   @Mapping(source = "foundTask.id", target = "taskId"),
   })
   GetProjectOutput projectToGetProjectOutput(Project project, Task foundTask);
   
}

