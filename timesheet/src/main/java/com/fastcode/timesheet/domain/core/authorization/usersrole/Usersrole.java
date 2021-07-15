package com.fastcode.timesheet.domain.core.authorization.usersrole;

import javax.persistence.*;
import java.time.*;
import com.fastcode.timesheet.domain.core.authorization.role.Role;
import com.fastcode.timesheet.domain.core.authorization.users.Users;
import com.fastcode.timesheet.domain.core.abstractentity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import com.querydsl.core.annotations.Config;

@Entity
@Config(defaultVariableName = "usersroleEntity")
@Table(name = "usersrole")
@IdClass(UsersroleId.class)
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Usersrole extends AbstractEntity {

    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "role_id", nullable = false)
    private Long roleId;
    
    @Id
    @EqualsAndHashCode.Include()
    @Column(name = "users_id", nullable = false)
    private Long usersId;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "role_id", insertable=false, updatable=false)
    private Role role;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "users_id", insertable=false, updatable=false)
    private Users users;


}



