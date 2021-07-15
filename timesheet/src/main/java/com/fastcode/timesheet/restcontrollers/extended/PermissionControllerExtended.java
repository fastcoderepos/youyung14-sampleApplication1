package com.fastcode.timesheet.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.timesheet.restcontrollers.core.PermissionController;
import com.fastcode.timesheet.application.extended.authorization.permission.IPermissionAppServiceExtended;
import com.fastcode.timesheet.application.extended.authorization.rolepermission.IRolepermissionAppServiceExtended;
import com.fastcode.timesheet.application.extended.authorization.userspermission.IUserspermissionAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.timesheet.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/permission/extended")
public class PermissionControllerExtended extends PermissionController {

		public PermissionControllerExtended(IPermissionAppServiceExtended permissionAppServiceExtended, IRolepermissionAppServiceExtended rolepermissionAppServiceExtended, IUserspermissionAppServiceExtended userspermissionAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		permissionAppServiceExtended,
    	rolepermissionAppServiceExtended,
    	userspermissionAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

