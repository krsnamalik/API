package com.example.smk3.restfulapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.smk3.restfulapi.entities.Mst_AuditEntity;
import com.example.smk3.restfulapi.repositories.Mst_AuditRepository;

@Service
public class Mst_AuditServiceImpl implements Mst_AuditService {
	
	@Autowired
	Mst_AuditRepository mst_AuditRepository;

    @Override
    public Mst_AuditEntity addMst_Audit(Mst_AuditEntity param) {
        return mst_AuditRepository.save(param);
    }

    @Override
    public List<Mst_AuditEntity> getAllMst_Audit() {
        return mst_AuditRepository.findAll();
    }

    @Override
    public Mst_AuditEntity getById(int id) {
        return mst_AuditRepository.findById(id).get();
    }

    @Override
    public Mst_AuditEntity updateMst_Audit(Mst_AuditEntity param) {
    	Mst_AuditEntity findMst_Audit = mst_AuditRepository.findById(param.getId_audit()).get();
    	findMst_Audit.setNo_ba(param.getNo_ba());
    	findMst_Audit.setId_company(param.getId_company());
    	findMst_Audit.setId_user(param.getId_user());
    	findMst_Audit.setTgl_audit(param.getTgl_audit());
    	findMst_Audit.setId_format(param.getId_format());
    	findMst_Audit.setNilai(param.getNilai());
    	findMst_Audit.setStatus(param.getStatus());
    	findMst_Audit.setTingkat(param.getTingkat());
    	findMst_Audit.setKetua_komp(param.getKetua_komp());
    	findMst_Audit.setSekret_komp(param.getSekret_komp());
    	findMst_Audit.setAnggota_komp(param.getAnggota_komp());
    	findMst_Audit.setUri_sign(param.getUri_sign());
    	findMst_Audit.setLampiran(param.getLampiran());
    	
        return mst_AuditRepository.save(findMst_Audit);
    }

    @Override
    public void deleteMst_Audit(int id) {
    	mst_AuditRepository.deleteById(id);
    	
    }

}
