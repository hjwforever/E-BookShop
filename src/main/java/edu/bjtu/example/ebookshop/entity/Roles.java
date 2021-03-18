package edu.bjtu.example.ebookshop.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Copyright(C), 2020-2021, aruoxi.com
 * FileName: Roles
 * Author: hjwforever
 * Date: 2021/3/17 001723:07
 * Description:
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Roles {
    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String role;

//    @OneToMany(mappedBy = "roles")
//    private Set<User> users=new HashSet<>();
    public void setRoles(Long _id, String _role) {
        id = _id;
        role = _role;
    }
}
