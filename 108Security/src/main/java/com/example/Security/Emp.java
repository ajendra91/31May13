package com.example.Security;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Emp {

    @Id
    @GeneratedValue
    public int empid;
    public String name;
    public String age;
    public String password;
    @OneToMany(cascade = CascadeType.ALL)
    public Set<Role> role;

    public Emp(String name, String age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }


    public void setRole(Set<Role> role) {
        this.role = role;
    }
}
