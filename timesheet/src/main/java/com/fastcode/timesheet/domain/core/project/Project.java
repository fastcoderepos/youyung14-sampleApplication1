package com.fastcode.timesheet.domain.core.project;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.time.*;
import com.fastcode.timesheet.domain.core.customer.Customer;
import com.fastcode.timesheet.domain.core.task.Task;
import com.fastcode.timesheet.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import com.querydsl.core.annotations.Config;

@Entity
@Config(defaultVariableName = "projectEntity")
@Table(name = "project")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Project extends AbstractEntity {

    @Basic
    @Column(name = "description", nullable = true,length =255)
    private String description;

    @Basic
    @Column(name = "enddate", nullable = false)
    private LocalDate enddate;

    @Id
    @EqualsAndHashCode.Include()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Basic
    @Column(name = "name", nullable = false,length =255)
    private String name;

    @Basic
    @Column(name = "startdate", nullable = false)
    private LocalDate startdate;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "customerid")
    private Customer customer;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Task> tasksSet = new HashSet<Task>();
    
    public void addTasks(Task tasks) {        
    	tasksSet.add(tasks);
        tasks.setProject(this);
    }
    public void removeTasks(Task tasks) {
        tasksSet.remove(tasks);
        tasks.setProject(null);
    }
    

}



