package com.fastcode.timesheet.domain.core.timeofftype;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.time.*;
import com.fastcode.timesheet.domain.core.timesheetdetails.Timesheetdetails;
import com.fastcode.timesheet.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import com.querydsl.core.annotations.Config;

@Entity
@Config(defaultVariableName = "timeofftypeEntity")
@Table(name = "timeofftype")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Timeofftype extends AbstractEntity {

    @Id
    @EqualsAndHashCode.Include()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Basic
    @Column(name = "typename", nullable = false,length =255)
    private String typename;

    @OneToMany(mappedBy = "timeofftype", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Timesheetdetails> timesheetdetailsSet = new HashSet<Timesheetdetails>();
    
    public void addTimesheetdetails(Timesheetdetails timesheetdetails) {        
    	timesheetdetailsSet.add(timesheetdetails);
        timesheetdetails.setTimeofftype(this);
    }
    public void removeTimesheetdetails(Timesheetdetails timesheetdetails) {
        timesheetdetailsSet.remove(timesheetdetails);
        timesheetdetails.setTimeofftype(null);
    }
    

}



