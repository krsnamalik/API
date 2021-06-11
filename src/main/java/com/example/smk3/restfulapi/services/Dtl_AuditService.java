package com.example.smk3.restfulapi.services;

import com.example.smk3.restfulapi.entities.Dtl_AuditEntity;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public interface Dtl_AuditService {

	Dtl_AuditEntity addDtl_Audit(Dtl_AuditEntity param);

    List<Dtl_AuditEntity> getAllDtl_Audit();

    Dtl_AuditEntity getById(int id);

    Dtl_AuditEntity updateDtl_Audit(Dtl_AuditEntity param);

    void deleteDtl_Audit(int id);
}
