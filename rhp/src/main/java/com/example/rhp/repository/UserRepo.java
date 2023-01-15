package com.example.rhp.repository;

import com.example.rhp.entity.User;
import com.example.rhp.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface UserRepo extends JpaRepository<User,String> {

    @Query(value = "SELECT * FROM user WHERE role_id=?",nativeQuery = true)
    public List<User>findAllCompany(String company);



}
