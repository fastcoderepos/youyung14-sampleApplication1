package com.fastcode.timesheet.domain.core.timesheetstatus;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
@Repository("timesheetstatusRepository")
public interface ITimesheetstatusRepository extends JpaRepository<Timesheetstatus, Long>,QuerydslPredicateExecutor<Timesheetstatus> {

}

