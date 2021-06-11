package com.example.smk3.restfulapi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.smk3.restfulapi.entities.CompanyEntity;
import com.example.smk3.restfulapi.repositories.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
    CompanyRepository companyRepository;

    @Override
    public CompanyEntity addCompany(CompanyEntity param) {
        return companyRepository.save(param);
    }

    @Override
    public List<CompanyEntity> getAllComapny() {
        return companyRepository.findAll();
    }

    @Override
    public CompanyEntity getById(int id) {
        return companyRepository.findById(id).get();
    }

    @Override
    public CompanyEntity updateCompany(CompanyEntity param) {
        
    	CompanyEntity findCompany = companyRepository.findById(param.getId_company()).get();
        findCompany.setNama(param.getNama());
        findCompany.setJns_usaha(param.getJns_usaha());
        findCompany.setAlamat(param.getAlamat());
        findCompany.setTelpon(param.getTelpon());
   
        return companyRepository.save(findCompany);
    }

    @Override
    public void deleteCompany(int id) {
        companyRepository.deleteById(id);
    	
    }

}
