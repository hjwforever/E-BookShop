package edu.bjtu.example.ebookshop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Optional;

/**
 * Copyright(C), 2020-2021, aruoxi.com
 * FileName: User
 * Author: hjwforever
 * Date: 2021/3/14 001414:35
 * Description:
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="user_id")
    private Long id;

    private String name;

    @Pattern(regexp ="^(0[0-9]{2,3}/-)?([2-9][0-9]{6,7})+(/-[0-9]{1,4})?$", message = "Phone number")
    @Size(max = 25)
    private String phone;

    @Email(message = "Email Address")
    @Size(max = 100)
    private String email;
    @ManyToOne(cascade = CascadeType.PERSIST)	//表示多方
    @JoinColumn(name ="role_id")
    private Roles role;

    @Size(max = 50)
    private String address1;

    @Size(max = 50)
    private String address2;

    @Size(max = 50)
    private String address3;

    @Size(max = 20)
    private String postalCode;

    @Size(max = 512)
    private String note;


    public void setUser(Long Id, String Name, String Phone, String Email, Roles roles, String Address1, String Address2, String Address3, String Postalcode, String Note) {
        id = Id;
        name = Name;
        role = roles;
        phone = Phone;
        email = Email;
        address1 = Address1;
        address2 = Address2;
        address3 = Address3;
        postalCode = Postalcode;
        note = Note;
    }

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", name='" + name + '\'' + ", address='" + address1 + '\'' + ", roles=" + role + '}';
    }
}
