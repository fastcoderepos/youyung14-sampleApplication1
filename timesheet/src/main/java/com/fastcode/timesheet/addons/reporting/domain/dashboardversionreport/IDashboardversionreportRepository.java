package com.fastcode.timesheet.addons.reporting.domain.dashboardversionreport;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.time.*;


@Repository("dashboardversionreportRepository")
public interface IDashboardversionreportRepository extends JpaRepository<Dashboardversionreport, DashboardversionreportId>,QuerydslPredicateExecutor<Dashboardversionreport> {

	@Query("select r from Dashboardversionreport r where r.dashboardversion.dashboardId = ?1 and r.dashboardversion.dashboardVersion =?2 and r.dashboardversion.userId=?3 ")
	List<Dashboardversionreport> findByDashboardIdAndVersionAndUsersId(Long dashboardId, String version, Long userId);
    
	@Query("select r from Dashboardversionreport r where r.dashboardversion.dashboardId = ?1 and r.dashboardversion.dashboardVersion =?2 and r.dashboardversion.userId=?3  ORDER BY r.orderId DESC")
	List<Dashboardversionreport> findByDashboardIdAndVersionAndUsersIdInDesc(Long id, String version, Long userId);

    @Query("select r from Dashboardversionreport r where r.report.id = ?1 and r.dashboardversion.userId=?2  and r.dashboardversion.dashboardVersion =?3")
	List<Dashboardversionreport> findByReportIdAndUsersIdAndVersion(Long reportId, Long userId, String version);
    
	@Query("select r from Dashboardversionreport r where r.dashboardversion.dashboardId = ?1")
	List<Dashboardversionreport> findByDashboardId(Long dashboardId);
	
	@Query("select r from Dashboardversionreport r where r.report.id = ?1")
	List<Dashboardversionreport> findByReportId(Long reportId);

    @Query("select r from Dashboardversionreport r where r.dashboardversion.dashboardId = ?1 and r.report.id = ?2 and r.dashboardversion.userId != ?3  and r.dashboardversion.dashboardVersion =?4")
	List<Dashboardversionreport> findByIdIfUsersIdNotSame(Long dashboardId,Long reportId, Long userId, String version);

	@Query("select r from Dashboardversionreport r where r.dashboardversion.userId=?1 ")
	List<Dashboardversionreport> findByUsersId( Long id );
}

