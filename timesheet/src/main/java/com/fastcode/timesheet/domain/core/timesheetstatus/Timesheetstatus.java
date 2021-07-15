package com.fastcode.timesheet.domain.core.timesheetstatus;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.time.*;
import com.fastcode.timesheet.domain.core.timesheet.Timesheet;
import com.fastcode.timesheet.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import com.querydsl.core.annotations.Config;

@Entity
@Config(defaultVariableName = "timesheetstatusEntity")
@Table(name = "timesheetstatus")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Timesheetstatus extends AbstractEntity {

    @Id
    @EqualsAndHashCode.Include()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Basic
    @Column(name = "statusname", nullable = false,length =255)
    private String statusname;

    @OneToMany(mappedBy = "timesheetstatus", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Timesheet> timesheetsSet = new HashSet<Timesheet>();
    
    public void addTimesheets(Timesheet timesheets) {        
    	timesheetsSet.add(timesheets);
        timesheets.setTimesheetstatus(this);
    }
    public void removeTimesheets(Timesheet timesheets) {
        timesheetsSet.remove(timesheets);
        timesheets.setTimesheetstatus(null);
    }
    

}



