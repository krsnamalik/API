package com.example.smk3.restfulapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.smk3.restfulapi.entities.Dtl_AuditEntity;
 
@Repository
public interface Dtl_AuditRepository extends JpaRepository<Dtl_AuditEntity, Integer> {

}
