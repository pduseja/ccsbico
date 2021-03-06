package com.ccsbi.co.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ccsbi.co.usermanagement.repository.entity.UserNameGenerator;

@Repository
public interface IUserNameGeneratorRepo extends JpaRepository<UserNameGenerator, Long> {
	
	@Query("SELECT userIDNumber FROM UserNameGenerator WHERE prefix=:prefix")
	int findLatestNumber(@Param("prefix") String prefix);
	
	@Modifying
    @Query("UPDATE UserNameGenerator ung SET ung.userIDNumber=:userIDNumber WHERE ung.prefix=:prefix")
    int updateSequenceNumber(@Param("userIDNumber") int userIDNumber, @Param("prefix") String prefix);

}
