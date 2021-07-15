package com.fastcode.timesheet.application.core.authorization.usersrole;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import com.fastcode.timesheet.application.core.authorization.usersrole.dto.*;
import com.fastcode.timesheet.domain.core.authorization.usersrole.IUsersroleRepository;
import com.fastcode.timesheet.domain.core.authorization.usersrole.QUsersrole;
import com.fastcode.timesheet.domain.core.authorization.usersrole.Usersrole;
import com.fastcode.timesheet.domain.core.authorization.usersrole.UsersroleId;
import com.fastcode.timesheet.domain.core.authorization.role.IRoleRepository;
import com.fastcode.timesheet.domain.core.authorization.role.Role;
import com.fastcode.timesheet.domain.core.authorization.users.IUsersRepository;
import com.fastcode.timesheet.domain.core.authorization.users.Users;
import com.fastcode.timesheet.commons.search.*;
import com.fastcode.timesheet.commons.logging.LoggingHelper;
import com.querydsl.core.BooleanBuilder;

import java.time.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page; 
import org.springframework.data.domain.Pageable; 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.apache.commons.lang3.StringUtils;

@Service("usersroleAppService")
@RequiredArgsConstructor
public class UsersroleAppService implements IUsersroleAppService {

	@Qualifier("usersroleRepository")
	@NonNull protected final IUsersroleRepository _usersroleRepository;

    @Qualifier("roleRepository")
	@NonNull protected final IRoleRepository _roleRepository;

    @Qualifier("usersRepository")
	@NonNull protected final IUsersRepository _usersRepository;

	@Qualifier("IUsersroleMapperImpl")
	@NonNull protected final IUsersroleMapper mapper;

	@NonNull protected final LoggingHelper logHelper;

    @Transactional(propagation = Propagation.REQUIRED)
	public CreateUsersroleOutput create(CreateUsersroleInput input) {

		Usersrole usersrole = mapper.createUsersroleInputToUsersrole(input);
		Role foundRole = null;
		Users foundUsers = null;
	  	if(input.getRoleId()!=null) {
			foundRole = _roleRepository.findById(input.getRoleId()).orElse(null);
			
		}
		else {
			return null;
		}
	  	if(input.getUsersId()!=null) {
			foundUsers = _usersRepository.findById(input.getUsersId()).orElse(null);
			
		}
		else {
			return null;
		}
		if(foundUsers != null || foundRole != null)
		{			
			if(!checkIfRoleAlreadyAssigned(foundUsers, foundRole))
			{
				foundRole.addUsersroles(usersrole);
				foundUsers.addUsersroles(usersrole);
				
			//	usersrole.setRole(foundRole);
			//	usersrole.setUsers(foundUsers);
			}
		 }
		 else {
		 	return null;
		 }

		Usersrole createdUsersrole = _usersroleRepository.save(usersrole);
		return mapper.usersroleToCreateUsersroleOutput(createdUsersrole);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public UpdateUsersroleOutput update(UsersroleId usersroleId, UpdateUsersroleInput input) {

		Usersrole existing = _usersroleRepository.findById(usersroleId).get();

		Usersrole usersrole = mapper.updateUsersroleInputToUsersrole(input);
		Role foundRole = null;
		Users foundUsers = null;
        
	  	if(input.getRoleId()!=null) { 
			foundRole = _roleRepository.findById(input.getRoleId()).orElse(null);
		}
		else {
			return null;
		}
        
	  	if(input.getUsersId()!=null) { 
			foundUsers = _usersRepository.findById(input.getUsersId()).orElse(null);
		}
		else {
			return null;
		}
		if(foundUsers != null || foundRole != null)
		{			
			if(checkIfRoleAlreadyAssigned(foundUsers, foundRole))
			{
				foundRole.addUsersroles(usersrole);
				foundUsers.addUsersroles(usersrole);
				//usersrole.setRole(foundRole);
				//usersrole.setUsers(foundUsers);
			}
		 }
		 else {
		 	return null;
		 }
		 	
		Usersrole updatedUsersrole = _usersroleRepository.save(usersrole);
		return mapper.usersroleToUpdateUsersroleOutput(updatedUsersrole);
	}
	
	public boolean checkIfRoleAlreadyAssigned(Users foundUsers,Role foundRole)
	{
		List<Usersrole> usersRole = _usersroleRepository.findByUsersId(foundUsers.getId());

		Iterator rIterator = usersRole.iterator();
		while (rIterator.hasNext()) {
			Usersrole ur = (Usersrole) rIterator.next();
			if (ur.getRole() == foundRole) {
				return true;
			}
		}
			
		return false;
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(UsersroleId usersroleId) {

		Usersrole existing = _usersroleRepository.findById(usersroleId).orElse(null); 
	 	
        if(existing.getRole() !=null)
        {
        existing.getRole().removeUsersroles(existing);
        }
        if(existing.getUsers() !=null)
        {
        existing.getUsers().removeUsersroles(existing);
        }
	 	_usersroleRepository.delete(existing);
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public FindUsersroleByIdOutput findById(UsersroleId usersroleId) {

		Usersrole foundUsersrole = _usersroleRepository.findById(usersroleId).orElse(null);
		if (foundUsersrole == null)  
			return null; 
 	   
 	    return mapper.usersroleToFindUsersroleByIdOutput(foundUsersrole);
	}
	
    //Role
	// ReST API Call - GET /usersrole/1/role
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
	public GetRoleOutput getRole(UsersroleId usersroleId) {

		Usersrole foundUsersrole = _usersroleRepository.findById(usersroleId).orElse(null);
		if (foundUsersrole == null) {
			logHelper.getLogger().error("There does not exist a usersrole wth a id=%s", usersroleId);
			return null;
		}
		Role re = foundUsersrole.getRole();
		return mapper.roleToGetRoleOutput(re, foundUsersrole);
	}
	
    //Users
	// ReST API Call - GET /usersrole/1/users
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
	public GetUsersOutput getUsers(UsersroleId usersroleId) {

		Usersrole foundUsersrole = _usersroleRepository.findById(usersroleId).orElse(null);
		if (foundUsersrole == null) {
			logHelper.getLogger().error("There does not exist a usersrole wth a id=%s", usersroleId);
			return null;
		}
		Users re = foundUsersrole.getUsers();
		return mapper.usersToGetUsersOutput(re, foundUsersrole);
	}
	
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<FindUsersroleByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception  {

		Page<Usersrole> foundUsersrole = _usersroleRepository.findAll(search(search), pageable);
		List<Usersrole> usersroleList = foundUsersrole.getContent();
		Iterator<Usersrole> usersroleIterator = usersroleList.iterator(); 
		List<FindUsersroleByIdOutput> output = new ArrayList<>();

		while (usersroleIterator.hasNext()) {
		Usersrole usersrole = usersroleIterator.next();
 	    output.add(mapper.usersroleToFindUsersroleByIdOutput(usersrole));
		}
		return output;
	}
	
	protected BooleanBuilder search(SearchCriteria search) throws Exception {

		QUsersrole usersrole= QUsersrole.usersroleEntity;
		if(search != null) {
			Map<String,SearchFields> map = new HashMap<>();
			for(SearchFields fieldDetails: search.getFields())
			{
				map.put(fieldDetails.getFieldName(),fieldDetails);
			}
			List<String> keysList = new ArrayList<String>(map.keySet());
			checkProperties(keysList);
			return searchKeyValuePair(usersrole, map,search.getJoinColumns());
		}
		return null;
	}
	
	protected void checkProperties(List<String> list) throws Exception  {
		for (int i = 0; i < list.size(); i++) {
			if(!(
		        list.get(i).replace("%20","").trim().equals("role") ||
//		        list.get(i).replace("%20","").trim().equals("displayName") ||
		        list.get(i).replace("%20","").trim().equals("users") ||
//		        list.get(i).replace("%20","").trim().equals("id") ||
				list.get(i).replace("%20","").trim().equals("roleId") ||
				list.get(i).replace("%20","").trim().equals("usersId")
			)) 
			{
			 throw new Exception("Wrong URL Format: Property " + list.get(i) + " not found!" );
			}
		}
	}
	
	protected BooleanBuilder searchKeyValuePair(QUsersrole usersrole, Map<String,SearchFields> map,Map<String,String> joinColumns) {
		BooleanBuilder builder = new BooleanBuilder();
        
		for (Map.Entry<String, SearchFields> details : map.entrySet()) {
			 if(details.getKey().replace("%20","").trim().equals("roleId")) {
			 	if(details.getValue().getOperator().equals("contains")) {
					builder.and(usersrole.roleId.like(details.getValue().getSearchValue() + "%"));
				} else if(details.getValue().getOperator().equals("equals") && StringUtils.isNumeric(details.getValue().getSearchValue())) {
					builder.and(usersrole.roleId.eq(Long.valueOf(details.getValue().getSearchValue())));
				} else if(details.getValue().getOperator().equals("notEqual") && StringUtils.isNumeric(details.getValue().getSearchValue())) {
					builder.and(usersrole.roleId.ne(Long.valueOf(details.getValue().getSearchValue())));
				} else if(details.getValue().getOperator().equals("range")) {
				  	if(StringUtils.isNumeric(details.getValue().getStartingValue()) && StringUtils.isNumeric(details.getValue().getEndingValue())) {
                	   builder.and(usersrole.roleId.between(Long.valueOf(details.getValue().getStartingValue()), Long.valueOf(details.getValue().getEndingValue())));
                   	} else if(StringUtils.isNumeric(details.getValue().getStartingValue())) {
                	  	builder.and(usersrole.roleId.goe(Long.valueOf(details.getValue().getStartingValue())));
                   	} else if(StringUtils.isNumeric(details.getValue().getEndingValue())) {
                	  	builder.and(usersrole.roleId.loe(Long.valueOf(details.getValue().getEndingValue())));
					}
				}
			}
			 if(details.getKey().replace("%20","").trim().equals("usersId")) {
			 	if(details.getValue().getOperator().equals("contains")) {
					builder.and(usersrole.usersId.like(details.getValue().getSearchValue() + "%"));
				} else if(details.getValue().getOperator().equals("equals") && StringUtils.isNumeric(details.getValue().getSearchValue())) {
					builder.and(usersrole.usersId.eq(Long.valueOf(details.getValue().getSearchValue())));
				} else if(details.getValue().getOperator().equals("notEqual") && StringUtils.isNumeric(details.getValue().getSearchValue())) {
					builder.and(usersrole.usersId.ne(Long.valueOf(details.getValue().getSearchValue())));
				} else if(details.getValue().getOperator().equals("range")) {
				  	if(StringUtils.isNumeric(details.getValue().getStartingValue()) && StringUtils.isNumeric(details.getValue().getEndingValue())) {
                	   builder.and(usersrole.usersId.between(Long.valueOf(details.getValue().getStartingValue()), Long.valueOf(details.getValue().getEndingValue())));
                   	} else if(StringUtils.isNumeric(details.getValue().getStartingValue())) {
                	  	builder.and(usersrole.usersId.goe(Long.valueOf(details.getValue().getStartingValue())));
                   	} else if(StringUtils.isNumeric(details.getValue().getEndingValue())) {
                	  	builder.and(usersrole.usersId.loe(Long.valueOf(details.getValue().getEndingValue())));
					}
				}
			}
	    
		    if(details.getKey().replace("%20","").trim().equals("role")) {
				if(details.getValue().getOperator().equals("contains")) {
					builder.and(usersrole.role.displayName.likeIgnoreCase("%"+ details.getValue().getSearchValue() + "%"));
				} else if(details.getValue().getOperator().equals("equals")) {
					builder.and(usersrole.role.displayName.eq(details.getValue().getSearchValue()));
				} else if(details.getValue().getOperator().equals("notEqual")) {
					builder.and(usersrole.role.displayName.ne(details.getValue().getSearchValue()));
				}
			}
		    if(details.getKey().replace("%20","").trim().equals("users")) {
				if(details.getValue().getOperator().equals("contains") && StringUtils.isNumeric(details.getValue().getSearchValue())) {
					builder.and(usersrole.users.id.like(details.getValue().getSearchValue() + "%"));
				} else if(details.getValue().getOperator().equals("equals") && StringUtils.isNumeric(details.getValue().getSearchValue())) {
					builder.and(usersrole.users.id.eq(Long.valueOf(details.getValue().getSearchValue())));
				} else if(details.getValue().getOperator().equals("notEqual") && StringUtils.isNumeric(details.getValue().getSearchValue())) {
					builder.and(usersrole.users.id.ne(Long.valueOf(details.getValue().getSearchValue())));
				} else if(details.getValue().getOperator().equals("range")) {
				   if(StringUtils.isNumeric(details.getValue().getStartingValue()) && StringUtils.isNumeric(details.getValue().getEndingValue())) {
                	   builder.and(usersrole.users.id.between(Long.valueOf(details.getValue().getStartingValue()), Long.valueOf(details.getValue().getEndingValue())));
                   } else if(StringUtils.isNumeric(details.getValue().getStartingValue())) {
                	   builder.and(usersrole.users.id.goe(Long.valueOf(details.getValue().getStartingValue())));
                   } else if(StringUtils.isNumeric(details.getValue().getEndingValue())) {
                	   builder.and(usersrole.users.id.loe(Long.valueOf(details.getValue().getEndingValue())));
				   }
			    }
			}
		}
		
		for (Map.Entry<String, String> joinCol : joinColumns.entrySet()) {
        if(joinCol != null && joinCol.getKey().equals("roleId")) {
		    builder.and(usersrole.role.id.eq(Long.parseLong(joinCol.getValue())));
        }
        
		if(joinCol != null && joinCol.getKey().equals("role")) {
		    builder.and(usersrole.role.displayName.eq(joinCol.getValue()));
        }
        }
		for (Map.Entry<String, String> joinCol : joinColumns.entrySet()) {
        if(joinCol != null && joinCol.getKey().equals("usersId")) {
		    builder.and(usersrole.users.id.eq(Long.parseLong(joinCol.getValue())));
        }
        
		if(joinCol != null && joinCol.getKey().equals("users")) {
		    builder.and(usersrole.users.id.eq(Long.parseLong(joinCol.getValue())));
        }
        }
		return builder;
	}
	
	public UsersroleId parseUsersroleKey(String keysString) {
		
		String[] keyEntries = keysString.split(",");
		UsersroleId usersroleId = new UsersroleId();
		
		Map<String,String> keyMap = new HashMap<String,String>();
		if(keyEntries.length > 1) {
			for(String keyEntry: keyEntries)
			{
				String[] keyEntryArr = keyEntry.split("=");
				if(keyEntryArr.length > 1) {
					keyMap.put(keyEntryArr[0], keyEntryArr[1]);					
				}
				else {
					return null;
				}
			}
		}
		else {
			String[] keyEntryArr = keysString.split("=");
			if(keyEntryArr.length > 1) {
				keyMap.put(keyEntryArr[0], keyEntryArr[1]);					
			}
			else 
			return null;
		}
		
		usersroleId.setRoleId(Long.valueOf(keyMap.get("roleId")));
		usersroleId.setUsersId(Long.valueOf(keyMap.get("usersId")));
		return usersroleId;
		
	}	

    
    
}



