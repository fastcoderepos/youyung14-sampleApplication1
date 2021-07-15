package com.fastcode.timesheet.application.core.authorization.users;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.fastcode.timesheet.domain.core.authorization.userspreference.Userspreference;
import com.fastcode.timesheet.application.core.authorization.users.dto.*;
import com.fastcode.timesheet.domain.core.authorization.users.Users;
import java.time.*;

@Mapper(componentModel = "spring")
public interface IUsersMapper {

   Users createUsersInputToUsers(CreateUsersInput usersDto);
   
   @Mappings({
   @Mapping(source = "entity.id", target = "id"),
   })
   CreateUsersOutput usersToCreateUsersOutput(Users entity,Userspreference userPreference);
   
    @Mappings({
    @Mapping(source = "usersProfile.firstname", target = "firstname"),
    @Mapping(source = "usersProfile.joinDate", target = "joinDate"),
    @Mapping(source = "usersProfile.lastname", target = "lastname"),
    @Mapping(source = "usersProfile.triggerGroup", target = "triggerGroup"),
    @Mapping(source = "usersProfile.triggerName", target = "triggerName"),
    @Mapping(source = "usersProfile.username", target = "username"),
    @Mapping(source = "usersProfile.emailaddress", target = "emailaddress")
    })
    UpdateUsersInput findUsersWithAllFieldsByIdOutputAndUsersProfileToUpdateUsersInput(FindUsersWithAllFieldsByIdOutput users, UsersProfile usersProfile);
    
    Users findUsersWithAllFieldsByIdOutputToUsers(FindUsersWithAllFieldsByIdOutput users);
    
    UsersProfile updateUsersOutputToUsersProfile(UpdateUsersOutput usersDto);
    
    UsersProfile findUsersByIdOutputToUsersProfile(FindUsersByIdOutput users);
    
    Users updateUsersInputToUsers(UpdateUsersInput usersDto);
    
   	UpdateUsersOutput usersToUpdateUsersOutput(Users entity);

   	@Mappings({
    @Mapping(source = "entity.versiono", target = "versiono"),
    @Mapping(source = "entity.id", target = "id"),
   	})
   	FindUsersByIdOutput usersToFindUsersByIdOutput(Users entity,Userspreference userPreference);

   	FindUsersWithAllFieldsByIdOutput usersToFindUsersWithAllFieldsByIdOutput(Users entity);
    FindUsersByUsernameOutput usersToFindUsersByUsernameOutput(Users entity);

}

