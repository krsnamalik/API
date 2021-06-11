package com.example.smk3.restfulapi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.smk3.restfulapi.entities.Dtl_AuditEntity;
import com.example.smk3.restfulapi.repositories.Dtl_AuditRepository;

@Service
public class Dtl_AuditServiceImpl implements Dtl_AuditService {
	@Autowired
	Dtl_AuditRepository dtl_AuditRepository;

    @Override
    public Dtl_AuditEntity addDtl_Audit(Dtl_AuditEntity param) {
        return dtl_AuditRepository.save(param);
    }

    @Override
    public List<Dtl_AuditEntity> getAllDtl_Audit() {
        return dtl_AuditRepository.findAll();
    }

    @Override
    public Dtl_AuditEntity getById(int id) {
        return dtl_AuditRepository.findById(id).get();
    }

    @Override
    public Dtl_AuditEntity updateDtl_Audit(Dtl_AuditEntity param) {
    	Dtl_AuditEntity findDtl_Audit = dtl_AuditRepository.findById(param.getId_dtl()).get();
    	findDtl_Audit.setId_audit(param.getId_audit());
    	findDtl_Audit.setNo_kriteria(param.getNo_kriteria());
    	findDtl_Audit.setIsi_audit(param.getIsi_audit());
    	findDtl_Audit.setHasil(param.getHasil());
    	findDtl_Audit.setBukti(param.getBukti());
    	findDtl_Audit.setTindak(param.getTindak());
    	findDtl_Audit.setComment(param.getComment());
        
        return dtl_AuditRepository.save(findDtl_Audit);
    }

    @Override
    public void deleteDtl_Audit(int id) {
    	dtl_AuditRepository.deleteById(id);
    	
    }
}
