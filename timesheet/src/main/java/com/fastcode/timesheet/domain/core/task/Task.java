package com.fastcode.timesheet.domain.core.task;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.time.*;
import com.fastcode.timesheet.domain.core.project.Project;
import com.fastcode.timesheet.domain.core.timesheetdetails.Timesheetdetails;
import com.fastcode.timesheet.domain.core.usertask.Usertask;
import com.fastcode.timesheet.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import com.querydsl.core.annotations.Config;

@Entity
@Config(defaultVariableName = "taskEntity")
@Table(name = "task")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Task extends AbstractEntity {

    @Basic
    @Column(name = "description", nullable = true,length =255)
    private String description;

    @Id
    @EqualsAndHashCode.Include()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Basic
    @Column(name = "isactive", nullable = false)
    private Boolean isactive;
    
    @Basic
    @Column(name = "name", nullable = false,length =255)
    private String name;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "projectid")
    private Project project;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Timesheetdetails> timesheetdetailsSet = new HashSet<Timesheetdetails>();
    
    public void addTimesheetdetails(Timesheetdetails timesheetdetails) {        
    	timesheetdetailsSet.add(timesheetdetails);
        timesheetdetails.setTask(this);
    }
    public void removeTimesheetdetails(Timesheetdetails timesheetdetails) {
        timesheetdetailsSet.remove(timesheetdetails);
        timesheetdetails.setTask(null);
    }
    
    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Usertask> usertasksSet = new HashSet<Usertask>();
    
    public void addUsertasks(Usertask usertasks) {        
    	usertasksSet.add(usertasks);
        usertasks.setTask(this);
    }
    public void removeUsertasks(Usertask usertasks) {
        usertasksSet.remove(usertasks);
        usertasks.setTask(null);
    }
    

}



