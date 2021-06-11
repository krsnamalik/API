package com.example.smk3.restfulapi.services;

import java.util.List;
import org.springframework.stereotype.Component;
import com.example.smk3.restfulapi.entities.Mst_AuditEntity;

@Component
public interface Mst_AuditService {
	
	Mst_AuditEntity addMst_Audit(Mst_AuditEntity param);

    List<Mst_AuditEntity> getAllMst_Audit();

    Mst_AuditEntity getById(int id);

    Mst_AuditEntity updateMst_Audit(Mst_AuditEntity param);

    void deleteMst_Audit(int id);
}
