package com.example.smk3.restfulapi.services;

import com.example.smk3.restfulapi.entities.UserEntity;

import java.util.List;

import org.springframework.stereotype.Component;

@Component

public interface UserService {

    UserEntity addUser(UserEntity param);

    List<UserEntity> getAllUser();

    UserEntity getById(int id);

    UserEntity updateUser(UserEntity param);

    void deleteUser(int id);

}
