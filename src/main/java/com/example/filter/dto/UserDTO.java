package com.example.filter.dto;

import com.example.filter.entity.Application;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private int id;
	
	private String name;
	
	private String eMail;
	
	private long contact;

	private Application application;
	
}
