package com.fastcode.timesheet.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.timesheet.restcontrollers.core.UsersroleController;
import com.fastcode.timesheet.application.extended.authorization.usersrole.IUsersroleAppServiceExtended;
import com.fastcode.timesheet.application.extended.authorization.role.IRoleAppServiceExtended;
import com.fastcode.timesheet.application.extended.authorization.users.IUsersAppServiceExtended;
import com.fastcode.timesheet.security.JWTAppService;
import org.springframework.core.env.Environment;
import com.fastcode.timesheet.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/usersrole/extended")
public class UsersroleControllerExtended extends UsersroleController {

		public UsersroleControllerExtended(IUsersroleAppServiceExtended usersroleAppServiceExtended, IRoleAppServiceExtended roleAppServiceExtended, IUsersAppServiceExtended usersAppServiceExtended,
	    JWTAppService jwtAppService, LoggingHelper helper, Environment env) {
		super(
		usersroleAppServiceExtended,
    	roleAppServiceExtended,
    	usersAppServiceExtended,
	    jwtAppService,
		helper, env);
	}

	//Add your custom code here

}

