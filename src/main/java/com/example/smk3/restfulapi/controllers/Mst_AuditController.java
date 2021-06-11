package com.example.smk3.restfulapi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.smk3.restfulapi.entities.Mst_AuditEntity;
import com.example.smk3.restfulapi.response.*;
import com.example.smk3.restfulapi.services.Mst_AuditService;

@RestController
@RequestMapping(value = "mst_audit")
public class Mst_AuditController {

	@Autowired
	Mst_AuditService mst_AuditService;

	@Autowired
	CommonResponseGenerator commonResponseGenerator;
	
	@PostMapping(value = "addMst_Audit")
	public CommonResponse<Mst_AuditEntity> addMst_Aduit(@RequestBody Mst_AuditEntity param) {
		try {
			Mst_AuditEntity mst_Audit = mst_AuditService.addMst_Audit(param);
			return commonResponseGenerator.successResponse(mst_Audit,"Success");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@GetMapping(value = "getAllMst_Audit")
	public CommonResponse<List<Mst_AuditEntity>> getAllMst_Aduit() {
		try {
			List<Mst_AuditEntity> mst_AuditList = mst_AuditService.getAllMst_Audit();
			return commonResponseGenerator.successResponse(mst_AuditList, "Success");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@GetMapping(value = "getById")
	public CommonResponse<Mst_AuditEntity> getById(@RequestParam int id) {
		try {
			Mst_AuditEntity mst_Audit = mst_AuditService.getById(id);
			return commonResponseGenerator.successResponse(mst_Audit, "Success");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@PutMapping(value = "updateMst_Aduit")
	public CommonResponse<Mst_AuditEntity> updateMst_Audit(@RequestBody Mst_AuditEntity param){
		try {
			Mst_AuditEntity mst_Audit = mst_AuditService.updateMst_Audit(param);
			return commonResponseGenerator.successResponse(mst_Audit, "Succes");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}

	@DeleteMapping(value = "deleteMst_Audit")
	public CommonResponse<Mst_AuditEntity> deleteMst_Audit(@RequestParam int id){
		try {
			mst_AuditService.deleteMst_Audit(id);
			return commonResponseGenerator.successResponse("Delete Mst_Audit");
		} catch (Exception e) {
			return commonResponseGenerator.failedResponse(e.getMessage());
		}
	}
}
