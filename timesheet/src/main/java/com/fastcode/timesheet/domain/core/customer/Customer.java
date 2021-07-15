package com.fastcode.timesheet.domain.core.customer;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.time.*;
import com.fastcode.timesheet.domain.core.project.Project;
import com.fastcode.timesheet.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import com.querydsl.core.annotations.Config;

@Entity
@Config(defaultVariableName = "customerEntity")
@Table(name = "customer")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Customer extends AbstractEntity {

    @Id
    @EqualsAndHashCode.Include()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerid", nullable = false)
    private Long customerid;
    
    @Basic
    @Column(name = "description", nullable = true,length =255)
    private String description;

    @Basic
    @Column(name = "isactive", nullable = false)
    private Boolean isactive;
    
    @Basic
    @Column(name = "name", nullable = false,length =255)
    private String name;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Project> projectsSet = new HashSet<Project>();
    
    public void addProjects(Project projects) {        
    	projectsSet.add(projects);
        projects.setCustomer(this);
    }
    public void removeProjects(Project projects) {
        projectsSet.remove(projects);
        projects.setCustomer(null);
    }
    

}



