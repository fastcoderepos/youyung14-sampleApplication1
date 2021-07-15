package com.fastcode.timesheet.domain.core.timesheetdetails;

import javax.persistence.*;
import java.time.*;
import com.fastcode.timesheet.domain.core.task.Task;
import com.fastcode.timesheet.domain.core.timeofftype.Timeofftype;
import com.fastcode.timesheet.domain.core.timesheet.Timesheet;
import com.fastcode.timesheet.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import com.querydsl.core.annotations.Config;

@Entity
@Config(defaultVariableName = "timesheetdetailsEntity")
@Table(name = "timesheetdetails")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Timesheetdetails extends AbstractEntity {

    @Basic
    @Column(name = "hours", nullable = true)
    private Double hours;
    
    @Id
    @EqualsAndHashCode.Include()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Basic
    @Column(name = "notes", nullable = true,length =255)
    private String notes;

    @Basic
    @Column(name = "workdate", nullable = false)
    private LocalDate workdate;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "taskid")
    private Task task;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "timeofftypeid")
    private Timeofftype timeofftype;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "timesheetid")
    private Timesheet timesheet;


}



