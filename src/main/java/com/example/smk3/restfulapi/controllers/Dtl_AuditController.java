package com.example.smk3.restfulapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.smk3.restfulapi.entities.Dtl_AuditEntity;
import com.example.smk3.restfulapi.response.CommonResponse;
import com.example.smk3.restfulapi.response.CommonResponseGenerator;
import com.example.smk3.restfulapi.services.Dtl_AuditService;

@RestController
@RequestMapping(value = "dtl_audit")
public class Dtl_AuditController {
	
	@Autowired
	Dtl_AuditService dtl_AuditService;

	@Autowired
	CommonResponseGenerator commonResponseGenerator;
	
	@PostMapping(value = "addDtl_Audit")
	public CommonResponse<Dtl_AuditEntity> addDtl_Audit(@RequestBody Dtl_AuditEntity param) {
		try {
			Dtl_AuditEntity dtl_audit = dtl_AuditService.addDtl_Audit(param);
			return commonResponseGenerator.successResponse(dtl_audit,"Success");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@GetMapping(value = "getAllDtl_Audit")
	public CommonResponse<List<Dtl_AuditEntity>> getAllDtl_Audit() {
		try {
			List<Dtl_AuditEntity> dtl_AuditList = dtl_AuditService.getAllDtl_Audit();
			return commonResponseGenerator.successResponse(dtl_AuditList, "Success");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@GetMapping(value = "getById")
	public CommonResponse<Dtl_AuditEntity> getById(@RequestParam int id) {
		try {
			Dtl_AuditEntity dtl_audit = dtl_AuditService.getById(id);
			return commonResponseGenerator.successResponse(dtl_audit, "Success");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@PutMapping(value = "updateDtl_Audit")
	public CommonResponse<Dtl_AuditEntity> updateDtl_Audit(@RequestBody Dtl_AuditEntity param){
		try {
			Dtl_AuditEntity dtl_audit = dtl_AuditService.updateDtl_Audit(param);
			return commonResponseGenerator.successResponse(dtl_audit, "Succes");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@DeleteMapping(value = "deleteDtl_Audit")
	public CommonResponse<Dtl_AuditEntity> deleteDtl_Audit(@RequestParam int id){
		try {
			dtl_AuditService.deleteDtl_Audit(id);
			return commonResponseGenerator.successResponse("Delete Detail Audit");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

}
