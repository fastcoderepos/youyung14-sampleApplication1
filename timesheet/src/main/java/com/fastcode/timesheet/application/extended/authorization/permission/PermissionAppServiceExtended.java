package com.fastcode.timesheet.application.extended.authorization.permission;

import org.springframework.stereotype.Service;
import com.fastcode.timesheet.application.core.authorization.permission.PermissionAppService;

import com.fastcode.timesheet.domain.extended.authorization.permission.IPermissionRepositoryExtended;
import com.fastcode.timesheet.commons.logging.LoggingHelper;

@Service("permissionAppServiceExtended")
public class PermissionAppServiceExtended extends PermissionAppService implements IPermissionAppServiceExtended {

	public PermissionAppServiceExtended(IPermissionRepositoryExtended permissionRepositoryExtended,
				IPermissionMapperExtended mapper,LoggingHelper logHelper) {

		super(permissionRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

