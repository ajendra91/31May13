package com.example.Security;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Role {

    @Id
    @GeneratedValue
    public int roleid;
    public String role;

    @ManyToOne
    @JoinColumn(name="empid")
    public Emp emp;

    public Role(String role, Emp emp) {
        this.role = role;
        this.emp = emp;
    }
}
