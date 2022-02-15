package com.example.MyCloudyStoreApplication.service.impl;

import com.example.MyCloudyStoreApplication.entity.Role;
import com.example.MyCloudyStoreApplication.repository.RoleRepository;
import com.example.MyCloudyStoreApplication.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    public List<Role> getAllRole() {
        return roleRepository.findAll();
    }

    public Optional<Role> findRoleById(int id) {
        return roleRepository.findById(id);
    }

}