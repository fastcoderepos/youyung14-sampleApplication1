package com.fastcode.timesheet.domain.core.task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
@Repository("taskRepository")
public interface ITaskRepository extends JpaRepository<Task, Long>,QuerydslPredicateExecutor<Task> {

}

