package com.example.smk3.restfulapi.controllers;

import com.example.smk3.restfulapi.entities.FormatEntity;
import com.example.smk3.restfulapi.response.CommonResponse;
import com.example.smk3.restfulapi.response.CommonResponseGenerator;
import com.example.smk3.restfulapi.services.FormatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "format")

public class FormatController {
	
	@Autowired
	FormatService formatService;
	
	@Autowired
	CommonResponseGenerator commonResponseGenerator;
	
	@PostMapping(value = "addFormat")
	public CommonResponse<FormatEntity> addFormat(@RequestBody FormatEntity param) {
		try {
			FormatEntity format = formatService.addFormat(param);
			return commonResponseGenerator.successResponse(format,"Success");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@GetMapping(value = "getAllFormat")
	public CommonResponse<List<FormatEntity>> getAllFormat() {
		try {
			List<FormatEntity> formatList = formatService.getAllFormat();
			return commonResponseGenerator.successResponse(formatList, "Success");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@GetMapping(value = "getById")
	public CommonResponse<FormatEntity> getById(@RequestParam int id) {
		try {
			FormatEntity format = formatService.getById(id);
			return commonResponseGenerator.successResponse(format, "Success");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@PutMapping(value = "updateFormat")
	public CommonResponse<FormatEntity> updateFormat(@RequestBody FormatEntity param){
		try {
			FormatEntity format = formatService.updateFormat(param);
			return commonResponseGenerator.successResponse(format, "Succes");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@DeleteMapping(value = "deleteFormat")
	public CommonResponse<FormatEntity> deleteFormat(@RequestParam int id){
		try {
			formatService.deleteFormat(id);
			return commonResponseGenerator.successResponse("Delete Format");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}
}
