package com.fastcode.timesheet.domain.core.usertask;

import javax.persistence.*;
import java.time.*;
import com.fastcode.timesheet.domain.core.task.Task;
import com.fastcode.timesheet.domain.core.authorization.users.Users;
import com.fastcode.timesheet.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import com.querydsl.core.annotations.Config;

@Entity
@Config(defaultVariableName = "usertaskEntity")
@Table(name = "usertask")
@IdClass(UsertaskId.class)
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Usertask extends AbstractEntity {

    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "taskid", nullable = false)
    private Long taskid;
    
    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "userid", nullable = false)
    private Long userid;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "taskid", insertable=false, updatable=false)
    private Task task;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "userid", insertable=false, updatable=false)
    private Users users;


}



