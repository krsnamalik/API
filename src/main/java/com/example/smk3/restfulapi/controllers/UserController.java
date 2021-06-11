package com.example.smk3.restfulapi.controllers;

import com.example.smk3.restfulapi.entities.UserEntity;
import com.example.smk3.restfulapi.response.CommonResponse;
import com.example.smk3.restfulapi.response.CommonResponseGenerator;
import com.example.smk3.restfulapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	CommonResponseGenerator commonResponseGenerator;

	@GetMapping(value = "checkAPI")
	public CommonResponse<String> checkApi() {
		return commonResponseGenerator.successResponse("Hallo Kakak", "Hello World");
	}

	@PostMapping(value = "addUser")
	public CommonResponse<UserEntity> addUser(@RequestBody UserEntity param) {
		try {
			UserEntity user = userService.addUser(param);
			return commonResponseGenerator.successResponse(user,"Success");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@GetMapping(value = "getAllUser")
	public CommonResponse<List<UserEntity>> getAllUser() {
		try {
			List<UserEntity> userList = userService.getAllUser();
			return commonResponseGenerator.successResponse(userList, "Success");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@GetMapping(value = "getById")
	public CommonResponse<UserEntity> getById(@RequestParam int id) {
		try {
			UserEntity user = userService.getById(id);
			return commonResponseGenerator.successResponse(user, "Success");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@PutMapping(value = "updateUser")
	public CommonResponse<UserEntity> updateUser(@RequestBody UserEntity param){
		try {
			UserEntity user = userService.updateUser(param);
			return commonResponseGenerator.successResponse(user, "Succes");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@DeleteMapping(value = "deleteUser")
	public CommonResponse<UserEntity> deleteUser(@RequestParam int id){
		try {
			userService.deleteUser(id);
			return commonResponseGenerator.successResponse("Delete User");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}
}