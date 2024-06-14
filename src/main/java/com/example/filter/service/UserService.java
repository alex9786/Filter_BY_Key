package com.example.filter.service;

import java.util.List;

import com.example.filter.dto.UserDTO;
import com.example.filter.entity.User;

public interface UserService {

	User post(UserDTO dto);

	UserDTO get(String name);

	List<Object> getAny(Object key);


}
