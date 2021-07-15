package com.fastcode.timesheet.addons.reporting.domain.dashboardrole;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.fastcode.timesheet.domain.core.authorization.role.Role;

public interface IDashboardroleRepositoryCustom {

	Page<Role> getAvailableDashboardrolesList(Long dashboardId, String search, Pageable pageable);

	Page<Role> getDashboardrolesList(Long dashboardId, String search, Pageable pageable);

}

