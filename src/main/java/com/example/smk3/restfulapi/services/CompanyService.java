package com.example.smk3.restfulapi.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.smk3.restfulapi.entities.CompanyEntity;

@Component
public interface CompanyService {
	
	CompanyEntity addCompany(CompanyEntity param);

	List<CompanyEntity> getAllComapny();

    CompanyEntity getById(int id);

    CompanyEntity updateCompany(CompanyEntity param);

    void deleteCompany(int id);

}
