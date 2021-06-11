package com.example.smk3.restfulapi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.smk3.restfulapi.entities.FormatEntity;
import com.example.smk3.restfulapi.repositories.FormatRepository;

@Service
public class FormatServiceImpl implements FormatService {

	@Autowired
    FormatRepository formatRepository;

    @Override
    public FormatEntity addFormat(FormatEntity param) {
        return formatRepository.save(param);
    }

    @Override
    public List<FormatEntity> getAllFormat() {
        return formatRepository.findAll();
    }

    @Override
    public FormatEntity getById(int id) {
        return formatRepository.findById(id).get();
    }

    @Override
    public FormatEntity updateFormat(FormatEntity param) {
        FormatEntity findFormat = formatRepository.findById(param.getId_format()).get();
        findFormat.setId_format(param.getId_format());
        findFormat.setNo_format(param.getNo_format());
        findFormat.setTanggal(param.getTanggal());
        findFormat.setUri_format(param.getUri_format());
        findFormat.setUri_kriteria(param.getUri_kriteria());
        
        return formatRepository.save(findFormat);
    }

    @Override
    public void deleteFormat(int id) {
        formatRepository.deleteById(id);
    	
    }
}
