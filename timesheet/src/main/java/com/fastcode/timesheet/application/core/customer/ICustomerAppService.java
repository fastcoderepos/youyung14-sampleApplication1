package com.fastcode.timesheet.application.core.customer;

import org.springframework.data.domain.Pageable;
import com.fastcode.timesheet.application.core.customer.dto.*;
import com.fastcode.timesheet.commons.search.SearchCriteria;

import java.util.*;

public interface ICustomerAppService {
	
	//CRUD Operations
	
	CreateCustomerOutput create(CreateCustomerInput customer);

    void delete(Long id);

    UpdateCustomerOutput update(Long id, UpdateCustomerInput input);

    FindCustomerByIdOutput findById(Long id);

    List<FindCustomerByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
    
    //Join Column Parsers

	Map<String,String> parseProjectsJoinColumn(String keysString);
}

