package com.dxc.msf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dxc.msf.model.UserDTO;
import com.dxc.msf.service.UserService;
import com.google.gson.Gson;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/user/create", method = RequestMethod.POST, produces = {
			"application/json; charset=UTF-8" })
	public @ResponseBody String eventCreate(@RequestBody UserDTO user) {
		boolean success = userService.createUser(user);
		if (success) {
			return "{\"status\": \"OK\"}";
		} else {
			return "{\"status\": \"Failed\"}";
		}
	}

	@RequestMapping(value = "/user/list", method = RequestMethod.GET, produces = { "application/json; charset=UTF-8" })
	public @ResponseBody String getListUser() {
		List<UserDTO> list = userService.getListUser();
		String json = new Gson().toJson(list);
		return json;
	}

}
