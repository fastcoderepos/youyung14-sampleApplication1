package com.fastcode.timesheet.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.timesheet.restcontrollers.core.UsersController;
import com.fastcode.timesheet.application.extended.authorization.users.IUsersAppServiceExtended;
import com.fastcode.timesheet.application.extended.timesheet.ITimesheetAppServiceExtended;
import com.fastcode.timesheet.application.extended.authorization.userspermission.IUserspermissionAppServiceExtended;
import com.fastcode.timesheet.application.extended.authorization.usersrole.IUsersroleAppServiceExtended;
import com.fastcode.timesheet.application.extended.usertask.IUsertaskAppServiceExtended;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.fastcode.timesheet.security.JWTAppService;
import org.springframework.core.env.Environment;
import com.fastcode.timesheet.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/users/extended")
public class UsersControllerExtended extends UsersController {

		public UsersControllerExtended(IUsersAppServiceExtended usersAppServiceExtended, ITimesheetAppServiceExtended timesheetAppServiceExtended, IUserspermissionAppServiceExtended userspermissionAppServiceExtended, IUsersroleAppServiceExtended usersroleAppServiceExtended, IUsertaskAppServiceExtended usertaskAppServiceExtended,
	    PasswordEncoder pEncoder,JWTAppService jwtAppService, LoggingHelper helper, Environment env) {
		super(
		usersAppServiceExtended,
    	timesheetAppServiceExtended,
    	userspermissionAppServiceExtended,
    	usersroleAppServiceExtended,
    	usertaskAppServiceExtended,
	    pEncoder,
	    jwtAppService,
		helper, env);
	}

	//Add your custom code here

}

