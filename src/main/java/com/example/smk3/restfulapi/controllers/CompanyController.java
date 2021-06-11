package com.example.smk3.restfulapi.controllers;

import com.example.smk3.restfulapi.entities.CompanyEntity;
import com.example.smk3.restfulapi.entities.UserEntity;
import com.example.smk3.restfulapi.response.CommonResponse;
import com.example.smk3.restfulapi.response.CommonResponseGenerator;
import com.example.smk3.restfulapi.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;


@RestController
@RequestMapping(value = "company")
public class CompanyController {
	
	@Autowired
	CompanyService companyService;
	
	@Autowired
	CommonResponseGenerator commonResponseGenerator;
	
	@PostMapping(value = "addCompany")
	public CommonResponse<UserEntity> addCompay(@RequestBody CompanyEntity param) {
		try {
			CompanyEntity company = companyService.addCompany(param);
			return commonResponseGenerator.successResponse(company,"Success");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}
	
	@GetMapping(value = "getAllCompany")
	public CommonResponse<List<CompanyEntity>> getAllCompany() {
		try {
			List<CompanyEntity> companyList = companyService.getAllComapny();
			return commonResponseGenerator.successResponse(companyList, "Success");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@GetMapping(value = "getById")
	public CommonResponse<CompanyEntity> getById(@RequestParam int id) {
		try {
			CompanyEntity company = companyService.getById(id);
			return commonResponseGenerator.successResponse(company, "Success");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@PutMapping(value = "updateCompany")
	public CommonResponse<CompanyEntity> updateCompany(@RequestBody CompanyEntity param){
		try {
			CompanyEntity company = companyService.updateCompany(param);
			return commonResponseGenerator.successResponse(company, "Succes");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@DeleteMapping(value = "deleteCompany")
	public CommonResponse<UserEntity> deleteCompany(@RequestParam int id){
		try {
			companyService.deleteCompany(id);
			return commonResponseGenerator.successResponse("Delete Company");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}
}
