package com.fastcode.timesheet.application.extended.customer;

import org.springframework.stereotype.Service;
import com.fastcode.timesheet.application.core.customer.CustomerAppService;

import com.fastcode.timesheet.domain.extended.customer.ICustomerRepositoryExtended;
import com.fastcode.timesheet.commons.logging.LoggingHelper;

@Service("customerAppServiceExtended")
public class CustomerAppServiceExtended extends CustomerAppService implements ICustomerAppServiceExtended {

	public CustomerAppServiceExtended(ICustomerRepositoryExtended customerRepositoryExtended,
				ICustomerMapperExtended mapper,LoggingHelper logHelper) {

		super(customerRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

