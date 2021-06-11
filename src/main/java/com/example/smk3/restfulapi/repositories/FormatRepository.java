package com.example.smk3.restfulapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.smk3.restfulapi.entities.FormatEntity;

@Repository
public interface FormatRepository extends JpaRepository<FormatEntity, Integer> {

}
