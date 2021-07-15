package com.fastcode.timesheet.addons.reporting.domain.permalink;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.UUID;


@Repository("permalinkRepository")
public interface IPermalinkRepository extends JpaRepository<Permalink, UUID>,QuerydslPredicateExecutor<Permalink> {

}

