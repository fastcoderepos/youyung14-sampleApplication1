package com.fastcode.timesheet.application.core.customer;

import org.mapstruct.Mapper;
import com.fastcode.timesheet.application.core.customer.dto.*;
import com.fastcode.timesheet.domain.core.customer.Customer;
import java.time.*;

@Mapper(componentModel = "spring")
public interface ICustomerMapper {

   Customer createCustomerInputToCustomer(CreateCustomerInput customerDto);
   CreateCustomerOutput customerToCreateCustomerOutput(Customer entity);
   
    Customer updateCustomerInputToCustomer(UpdateCustomerInput customerDto);
    
   	UpdateCustomerOutput customerToUpdateCustomerOutput(Customer entity);

   	FindCustomerByIdOutput customerToFindCustomerByIdOutput(Customer entity);


}

