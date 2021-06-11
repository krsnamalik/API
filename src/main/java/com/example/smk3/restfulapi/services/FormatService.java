package com.example.smk3.restfulapi.services;

import com.example.smk3.restfulapi.entities.FormatEntity;

import java.util.List;

import org.springframework.stereotype.Component;

@Component

public interface FormatService {

	
	FormatEntity addFormat(FormatEntity param);

    List<FormatEntity> getAllFormat();

    FormatEntity getById(int id);

    FormatEntity updateFormat(FormatEntity param);

    void deleteFormat(int id);
}
