package org.framestudy.provider.repository.jpa;

import org.framestudy.models.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserHandleRepository extends JpaRepository<UserInfo, Long>{
	
}
