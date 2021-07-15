package com.fastcode.timesheet.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.timesheet.restcontrollers.core.RolepermissionController;
import com.fastcode.timesheet.application.extended.authorization.rolepermission.IRolepermissionAppServiceExtended;
import com.fastcode.timesheet.application.extended.authorization.permission.IPermissionAppServiceExtended;
import com.fastcode.timesheet.application.extended.authorization.role.IRoleAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.timesheet.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/rolepermission/extended")
public class RolepermissionControllerExtended extends RolepermissionController {

		public RolepermissionControllerExtended(IRolepermissionAppServiceExtended rolepermissionAppServiceExtended, IPermissionAppServiceExtended permissionAppServiceExtended, IRoleAppServiceExtended roleAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		rolepermissionAppServiceExtended,
    	permissionAppServiceExtended,
    	roleAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

