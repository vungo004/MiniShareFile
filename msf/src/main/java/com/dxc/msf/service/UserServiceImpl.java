package com.dxc.msf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dxc.msf.dao.UserDAO;
import com.dxc.msf.model.UserDTO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;
	
	@Override
	public boolean createUser(UserDTO user) {
		if(!user.getUserName().isEmpty() && !user.getUserPassword().isEmpty())
		{
		boolean success = userDAO.createUser(user);
			if(success) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
	}

	@Override
	public List<UserDTO> getListUser() {
		return userDAO.getListUser();
	}

	@Override
	public boolean updateUser(UserDTO user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(UserDTO user) {
		// TODO Auto-generated method stub
		return false;
	}

}
