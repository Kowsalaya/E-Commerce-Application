package com.example.MyCloudyStoreApplication.service;

import com.example.MyCloudyStoreApplication.entity.Role;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RoleService {
    List<Role> getAllRole();

    Optional<Role> findRoleById(int id);

}
