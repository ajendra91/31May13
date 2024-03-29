package com.example.Security2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@RestController
public class EmpController {

    @Autowired
    public EmpDao empDao;

    /*@PostConstruct
    public void add(){

        Emp emp1=new Emp(1,"super","22","super");
        Set<Role> rset1 =new HashSet<Role>();
        rset1.add(new Role("SUPER",emp1));
        rset1.add(new Role("ADMIN",emp1));
        rset1.add(new Role("USER",emp1));
        emp1.setRole(rset1);
        empDao.save(emp1);

        Emp emp2=new Emp(2,"admin","33","admin");
        Set<Role> rset2 =new HashSet<Role>();
        rset2.add(new Role("ADMIN",emp2));
        rset2.add(new Role("USER",emp2));
        emp2.setRole(rset2);
        empDao.save(emp2);

        Emp emp3=new Emp(3,"user","11","user");
        Set<Role> rset3 =new HashSet<Role>();
        rset3.add(new Role("USER",emp3));
        emp3.setRole(rset3);
        empDao.save(emp3);

    }*/

    @PreAuthorize("hasRole('ROLE_SUPER')")
    @RequestMapping("/super")
    public String hello(){
        return "this is super admin api...";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping("/admin")
    public String admin(){
        return "this is admin api...";
    }

    @PreAuthorize("hasRole('ROLE_USER')")
    @RequestMapping("/user")
    public String user(){
        return "this is user api...";
    }

}
