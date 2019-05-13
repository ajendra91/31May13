package com.example.Security2;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Emp {

    @Id
    @GeneratedValue
    public int empid;
    public String name;
    public String age;
    public String password;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "emp_role", joinColumns = @JoinColumn(name = "empid"),
            inverseJoinColumns = @JoinColumn(name = "roleid"))
    public Set<Role> role;

    public Emp(int empid, String name, String age, String password) {
        this.empid = empid;
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }
}
