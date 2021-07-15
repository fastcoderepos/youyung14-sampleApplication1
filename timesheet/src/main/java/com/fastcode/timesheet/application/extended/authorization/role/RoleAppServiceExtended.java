package com.fastcode.timesheet.application.extended.authorization.role;

import org.springframework.stereotype.Service;
import com.fastcode.timesheet.application.core.authorization.role.RoleAppService;

import com.fastcode.timesheet.domain.extended.authorization.role.IRoleRepositoryExtended;
import com.fastcode.timesheet.commons.logging.LoggingHelper;

@Service("roleAppServiceExtended")
public class RoleAppServiceExtended extends RoleAppService implements IRoleAppServiceExtended {

	public RoleAppServiceExtended(IRoleRepositoryExtended roleRepositoryExtended,
				IRoleMapperExtended mapper,LoggingHelper logHelper) {

		super(roleRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

