package com.example.smk3.restfulapi.services;

import com.example.smk3.restfulapi.entities.UserEntity;
import com.example.smk3.restfulapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserEntity addUser(UserEntity param) {
        return userRepository.save(param);
    }

    @Override
    public List<UserEntity> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity getById(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public UserEntity updateUser(UserEntity param) {
        UserEntity findUser = userRepository.findById(param.getId_user()).get();
        findUser.setNama(param.getNama());
        findUser.setAddress(param.getAddress());
        findUser.setJabatan(param.getJabatan());
        findUser.setNip(param.getNip());
        findUser.setPassword(param.getPassword());
        findUser.setRole_enum(param.getRole_enum());
        findUser.setUid(param.getUid());
        findUser.setUri_sign(param.getUri_sign());
        return userRepository.save(findUser);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
