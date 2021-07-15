package com.fastcode.timesheet.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.timesheet.restcontrollers.core.CustomerController;
import com.fastcode.timesheet.application.extended.customer.ICustomerAppServiceExtended;
import com.fastcode.timesheet.application.extended.project.IProjectAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.timesheet.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/customer/extended")
public class CustomerControllerExtended extends CustomerController {

		public CustomerControllerExtended(ICustomerAppServiceExtended customerAppServiceExtended, IProjectAppServiceExtended projectAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		customerAppServiceExtended,
    	projectAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

