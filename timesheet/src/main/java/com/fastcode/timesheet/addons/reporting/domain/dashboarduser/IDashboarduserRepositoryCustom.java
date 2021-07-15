package com.fastcode.timesheet.addons.reporting.domain.dashboarduser;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.fastcode.timesheet.domain.core.authorization.users.Users;

public interface IDashboarduserRepositoryCustom {

	Page<Users> getAvailableDashboardusersList(Long dashboardId, String search, Pageable pageable);

	Page<Users> getDashboardusersList(Long dashboardId, String search, Pageable pageable);

}

