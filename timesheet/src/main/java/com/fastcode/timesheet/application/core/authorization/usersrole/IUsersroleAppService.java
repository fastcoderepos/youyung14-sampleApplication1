package com.fastcode.timesheet.application.core.authorization.usersrole;

import com.fastcode.timesheet.domain.core.authorization.usersrole.UsersroleId;
import org.springframework.data.domain.Pageable;
import com.fastcode.timesheet.application.core.authorization.usersrole.dto.*;
import com.fastcode.timesheet.commons.search.SearchCriteria;

import java.util.*;

public interface IUsersroleAppService {
	
	//CRUD Operations
	
	CreateUsersroleOutput create(CreateUsersroleInput usersrole);

    void delete(UsersroleId usersroleId);

    UpdateUsersroleOutput update(UsersroleId usersroleId, UpdateUsersroleInput input);

    FindUsersroleByIdOutput findById(UsersroleId usersroleId);

    List<FindUsersroleByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
	//Relationship Operations
	//Relationship Operations
    
    GetRoleOutput getRole(UsersroleId usersroleId);
    
    GetUsersOutput getUsers(UsersroleId usersroleId);
    
    //Join Column Parsers
    
	UsersroleId parseUsersroleKey(String keysString);
}

