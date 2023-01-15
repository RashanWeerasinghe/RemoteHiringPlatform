package com.example.rhp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name="user_role")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRole {

    @Id
    @Column(name = "ID")
    private String Id;
    @Column(name = "role_name")
    private String roleName;
    @Column(name = "role_Description")
    private String roleDescription;


    @OneToMany(mappedBy = "userRole")
    private List<User> user;

}
