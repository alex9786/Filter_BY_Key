package com.example.filter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.filter.dto.UserDTO;
import com.example.filter.entity.User;
import com.example.filter.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserRepository userRepo;

	@Override
	public User post(UserDTO dto) {
		User entity = new User();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setEMail(dto.getEMail());
		entity.setContact(dto.getContact());
		entity.setApplication(dto.getApplication());
		return userRepo.save(entity);
	}

	@Override
	public UserDTO get(String name) {
		Optional<User> user =userRepo.findByName(name);
		User entity =user.get();
		UserDTO dto = new UserDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setEMail(entity.getEMail());
		dto.setContact(entity.getContact());
		dto.setApplication(entity.getApplication());
		return dto;
	}

	@Override
	public List<Object> getAny(Object key) {
		return userRepo.findByKey(key);
	}



	
	
}
