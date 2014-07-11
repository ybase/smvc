package com.ybase.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ybase.demo.dao.UserDAO;


@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;

	public int userCount() {
		return userDAO.getAllUser().size();
	}
}
