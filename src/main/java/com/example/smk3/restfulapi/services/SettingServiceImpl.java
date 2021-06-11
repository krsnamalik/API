package com.example.smk3.restfulapi.services;

import com.example.smk3.restfulapi.entities.SettingEntity;
import com.example.smk3.restfulapi.repositories.SettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SettingServiceImpl implements SettingService {

	@Autowired
    SettingRepository settingRepository;

    @Override
    public SettingEntity addSetting(SettingEntity param) {
        return settingRepository.save(param);
    }

    @Override
    public List<SettingEntity> getAllSetting() {
        return settingRepository.findAll();
    }

    @Override
    public SettingEntity getById(int id) {
        return settingRepository.findById(id).get();
    }

    @Override
    public SettingEntity updateSetting(SettingEntity param) {
        SettingEntity findSetting = settingRepository.findById(param.getId_setting()).get();
        findSetting.setId_format(param.getId_format());
        findSetting.setTanggal(param.getTanggal());
        findSetting.setUri_sign(param.getUri_sign());
        
        return settingRepository.save(findSetting);
    }

    @Override
    public void deleteSetting(int id) {
        settingRepository.deleteById(id);
    	
    }
}
