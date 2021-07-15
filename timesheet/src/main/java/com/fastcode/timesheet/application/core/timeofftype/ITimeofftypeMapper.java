package com.fastcode.timesheet.application.core.timeofftype;

import org.mapstruct.Mapper;
import com.fastcode.timesheet.application.core.timeofftype.dto.*;
import com.fastcode.timesheet.domain.core.timeofftype.Timeofftype;
import java.time.*;

@Mapper(componentModel = "spring")
public interface ITimeofftypeMapper {

   Timeofftype createTimeofftypeInputToTimeofftype(CreateTimeofftypeInput timeofftypeDto);
   CreateTimeofftypeOutput timeofftypeToCreateTimeofftypeOutput(Timeofftype entity);
   
    Timeofftype updateTimeofftypeInputToTimeofftype(UpdateTimeofftypeInput timeofftypeDto);
    
   	UpdateTimeofftypeOutput timeofftypeToUpdateTimeofftypeOutput(Timeofftype entity);

   	FindTimeofftypeByIdOutput timeofftypeToFindTimeofftypeByIdOutput(Timeofftype entity);


}

