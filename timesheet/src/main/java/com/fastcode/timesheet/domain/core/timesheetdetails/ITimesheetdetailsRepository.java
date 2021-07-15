package com.fastcode.timesheet.domain.core.timesheetdetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
@Repository("timesheetdetailsRepository")
public interface ITimesheetdetailsRepository extends JpaRepository<Timesheetdetails, Long>,QuerydslPredicateExecutor<Timesheetdetails> {

}

