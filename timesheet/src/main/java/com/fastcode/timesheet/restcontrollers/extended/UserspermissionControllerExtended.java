package com.fastcode.timesheet.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.timesheet.restcontrollers.core.UserspermissionController;
import com.fastcode.timesheet.application.extended.authorization.userspermission.IUserspermissionAppServiceExtended;
import com.fastcode.timesheet.application.extended.authorization.permission.IPermissionAppServiceExtended;
import com.fastcode.timesheet.application.extended.authorization.users.IUsersAppServiceExtended;
import com.fastcode.timesheet.security.JWTAppService;
import org.springframework.core.env.Environment;
import com.fastcode.timesheet.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/userspermission/extended")
public class UserspermissionControllerExtended extends UserspermissionController {

		public UserspermissionControllerExtended(IUserspermissionAppServiceExtended userspermissionAppServiceExtended, IPermissionAppServiceExtended permissionAppServiceExtended, IUsersAppServiceExtended usersAppServiceExtended,
	    JWTAppService jwtAppService, LoggingHelper helper, Environment env) {
		super(
		userspermissionAppServiceExtended,
    	permissionAppServiceExtended,
    	usersAppServiceExtended,
	    jwtAppService,
		helper, env);
	}

	//Add your custom code here

}

