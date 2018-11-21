package com.ccsbi.co.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ccsbi.co.usermanagement.repository.entity.UsersDetails;

public interface UsersDetailsRepo extends JpaRepository<UsersDetails, Long> {

	@Query("SELECT password FROM UsersDetails WHERE UserId=:userId")
	String loginUser(@Param("userId") int userId);
}
