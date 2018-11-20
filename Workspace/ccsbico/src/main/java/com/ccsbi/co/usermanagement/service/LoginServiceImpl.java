package com.ccsbi.co.usermanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccsbi.co.usermanagement.repository.UsersDetailsRepo;
import com.ccsbi.co.usermanagement.repository.UsersRepo;
import com.ccsbi.co.usermanagement.service.model.Login;

@Service
public class LoginServiceImpl implements ILoginService {

	@Autowired
	UsersDetailsRepo usersDetailsRepo;

	@Autowired
	UsersRepo usersRepo;

	@Override
	public String login(Login login) {

		String userName = login.getUserName();
		String password = null;
		int userId = usersRepo.loginUser(userName);

		if (userId >0) {

			password = usersDetailsRepo.loginUser(userId);
		}
		if (password.equals(login.getPassword())) {
			return "Success";
		} else {
			return "";
		}

	}
}
