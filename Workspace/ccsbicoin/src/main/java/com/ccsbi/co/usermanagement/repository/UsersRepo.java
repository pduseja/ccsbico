package com.ccsbi.co.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ccsbi.co.usermanagement.repository.entity.Users;

public interface UsersRepo extends JpaRepository<Users, Long> {
	
	@Query("SELECT userId FROM Users WHERE UserName=:userName")
	int loginUser(@Param("userName") String userName);

}
