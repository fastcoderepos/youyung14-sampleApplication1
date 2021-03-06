package com.fastcode.timesheet.application.core.authorization.tokenverification;

import com.fastcode.timesheet.domain.core.authorization.tokenverification.Tokenverification;

public interface ITokenVerificationAppService {
	
	Tokenverification findByTokenAndType(String token, String type);

	Tokenverification generateToken(String type,Long usersId);

	Tokenverification findByUsersIdAndType(Long usersId, String type);

	void deleteToken(Tokenverification entity);

}

