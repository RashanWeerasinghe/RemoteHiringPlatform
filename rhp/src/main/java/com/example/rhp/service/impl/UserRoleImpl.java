package com.example.rhp.service.impl;

import com.example.rhp.entity.User;
import com.example.rhp.entity.UserRole;
import com.example.rhp.repository.UserRepo;
import com.example.rhp.repository.UserRoleRepo;
import com.example.rhp.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserRoleImpl implements UserRoleService {
    private final UserRoleRepo userRoleRepo;
    private final UserRepo userRepo;
    @Autowired
    public UserRoleImpl(UserRoleRepo userRoleRepo, UserRepo userRepo) {
        this.userRoleRepo = userRoleRepo;
        this.userRepo = userRepo;
    }

    @Override
    public void initializeRoles() {
        List<UserRole> userRoles = userRoleRepo.findAll();
        UserRole company=null;
        if (userRoles.isEmpty()) {
            UserRole role1 = new UserRole("UR-1", "COMPANY",
                    "Super Privileges", null);
            UserRole role2 = new UserRole("UR-2", "CANDIDATE",
                    "CANDIDATE Privileges", null);
            UserRole role3 = new UserRole("UR-3", "INTERVIEWER",
                    "INTERVIEWER", null);
            company=role1;

            userRoleRepo.saveAll(List.of(role1,role2,role3));
        }
        if (userRepo.findAllCompany("UR-1").isEmpty()){
            User user = new User(
                    "/*gen id*/",
                    "011",
                    "test@gmail.com",
                    "Anna",
                    "Stephany",
                    "1234",
                    true,
                    true,
                    true,
                    true,
                    "/*gen prefix*/",
                    null,
                    null,
                    null,
                    null
            );
            userRepo.save(user);
        }

    }
}
