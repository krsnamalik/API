package com.example.smk3.restfulapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.smk3.restfulapi.entities.Mst_AuditEntity;

@Repository
public interface Mst_AuditRepository extends JpaRepository<Mst_AuditEntity, Integer> {

}
