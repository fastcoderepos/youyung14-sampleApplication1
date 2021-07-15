package com.fastcode.timesheet.addons.reporting.domain.reportuser;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.fastcode.timesheet.domain.core.authorization.users.Users;


public interface IReportuserRepositoryCustom {

	Page<Users> getAvailableReportusersList(Long reportId, String search, Pageable pageable);
	
	Page<Users> getReportusersList(Long reportId, String search, Pageable pageable);
	
}

