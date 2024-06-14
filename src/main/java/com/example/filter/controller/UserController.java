package com.example.filter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.filter.dto.UserDTO;
import com.example.filter.entity.User;
import com.example.filter.service.UserService;

@RestController
@RequestMapping("/userApi")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/post")
	public User post(@RequestBody UserDTO dto) {
		return userService.post(dto);
	}
	
	@GetMapping("/get/{name}")
	public UserDTO get(@PathVariable ("name") String name) {
		return userService.get(name);
	}
	
	@GetMapping("/getBy")
	public List<Object> getAny(@RequestParam (value="key") Object key) {
		return userService.getAny(key);
	}
	


}
