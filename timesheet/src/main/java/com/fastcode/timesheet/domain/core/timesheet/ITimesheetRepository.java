package com.fastcode.timesheet.domain.core.timesheet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
@Repository("timesheetRepository")
public interface ITimesheetRepository extends JpaRepository<Timesheet, Long>,QuerydslPredicateExecutor<Timesheet> {

}

