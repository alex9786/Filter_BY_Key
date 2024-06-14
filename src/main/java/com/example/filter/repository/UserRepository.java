package com.example.filter.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.filter.dto.UserDTO;
import com.example.filter.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByName( String name);
	
	@Query(value="select user.id,user.name,user.email,application.app_name,application.purpose "
			+ " from User inner join application on user.fk_id=application.app_id "
			+ " where user.name like %:key% or user.email like %:key% or "
			+ " user.contact like %:key%  or application.app_name like %:key% or "
			+ " application.purpose like %:key% ", nativeQuery = true)
	List<Object> findByKey(Object key);

	
	
}
