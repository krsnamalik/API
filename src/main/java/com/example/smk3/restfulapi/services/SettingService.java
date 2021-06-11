package com.example.smk3.restfulapi.services;

import com.example.smk3.restfulapi.entities.SettingEntity;
import java.util.List;
import org.springframework.stereotype.Component;

@Component

public interface SettingService {

	SettingEntity addSetting(SettingEntity param);

    List<SettingEntity> getAllSetting();

    SettingEntity getById(int id);

    SettingEntity updateSetting(SettingEntity param);

    void deleteSetting(int id);
    
}
