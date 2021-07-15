package com.fastcode.timesheet.addons.reporting.domain.reportrole;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.fastcode.timesheet.domain.core.authorization.role.Role;

public interface IReportroleRepositoryCustom {

	Page<Role> getAvailableReportrolesList(Long reportId, String search, Pageable pageable);

	Page<Role> getReportrolesList(Long reportId, String search, Pageable pageable);


}

