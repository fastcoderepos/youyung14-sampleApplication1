package com.fastcode.timesheet.application.core.usertask;

import com.fastcode.timesheet.domain.core.usertask.UsertaskId;
import org.springframework.data.domain.Pageable;
import com.fastcode.timesheet.application.core.usertask.dto.*;
import com.fastcode.timesheet.commons.search.SearchCriteria;

import java.util.*;

public interface IUsertaskAppService {
	
	//CRUD Operations
	
	CreateUsertaskOutput create(CreateUsertaskInput usertask);

    void delete(UsertaskId usertaskId);

    UpdateUsertaskOutput update(UsertaskId usertaskId, UpdateUsertaskInput input);

    FindUsertaskByIdOutput findById(UsertaskId usertaskId);

    List<FindUsertaskByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
	//Relationship Operations
	//Relationship Operations
    
    GetTaskOutput getTask(UsertaskId usertaskId);
    
    GetUsersOutput getUsers(UsertaskId usertaskId);
    
    //Join Column Parsers
    
	UsertaskId parseUsertaskKey(String keysString);
}

