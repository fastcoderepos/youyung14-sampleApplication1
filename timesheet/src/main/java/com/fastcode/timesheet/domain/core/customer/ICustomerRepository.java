package com.fastcode.timesheet.domain.core.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
@Repository("customerRepository")
public interface ICustomerRepository extends JpaRepository<Customer, Long>,QuerydslPredicateExecutor<Customer> {

}

