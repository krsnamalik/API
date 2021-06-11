package com.example.smk3.restfulapi.controllers;

import com.example.smk3.restfulapi.entities.SettingEntity;
import com.example.smk3.restfulapi.response.CommonResponse;
import com.example.smk3.restfulapi.response.CommonResponseGenerator;
import com.example.smk3.restfulapi.services.SettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "setting")

public class SettingController {

	@Autowired
	SettingService settingService;

	@Autowired
	CommonResponseGenerator commonResponseGenerator;

	@PostMapping(value = "addSetting")
	public CommonResponse<SettingEntity> addSetting(@RequestBody SettingEntity param) {
		try {
			SettingEntity setting = settingService.addSetting(param);
			return commonResponseGenerator.successResponse(setting,"Success");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@GetMapping(value = "getAllSetting")
	public CommonResponse<List<SettingEntity>> getAllSetting() {
		try {
			List<SettingEntity> settingList = settingService.getAllSetting();
			return commonResponseGenerator.successResponse(settingList, "Success");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@GetMapping(value = "getById")
	public CommonResponse<SettingEntity> getById(@RequestParam int id) {
		try {
			SettingEntity setting = settingService.getById(id);
			return commonResponseGenerator.successResponse(setting, "Success");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@PutMapping(value = "updateSetting")
	public CommonResponse<SettingEntity> updateSetting(@RequestBody SettingEntity param){
		try {
			SettingEntity setting = settingService.updateSetting(param);
			return commonResponseGenerator.successResponse(setting, "Succes");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@DeleteMapping(value = "deleteSetting")
	public CommonResponse<SettingEntity> deleteSetting(@RequestParam int id){
		try {
			settingService.deleteSetting(id);
			return commonResponseGenerator.successResponse("Delete Setting");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}
}
