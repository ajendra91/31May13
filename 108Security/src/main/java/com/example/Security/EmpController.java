package com.example.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@RestController
public class EmpController {

    @Autowired
    private EmpDao empDao;

    @Autowired
    private RoleDao roleDao;

    @PostConstruct
    public void add(){

        Emp emp1=new Emp("super","22","super");

        Set role1 = new HashSet<Role>(){{
            add(new Role("SUPER", emp1));
            add(new Role("ADMIN", emp1));
            add(new Role("USER", emp1));
        }};
        emp1.setRole(role1);

        Emp emp2=new Emp("admin","22","admin");

        Set role2 = new HashSet<Role>(){{
            add(new Role("ADMIN", emp1));
            add(new Role("USER", emp1));
        }};
        emp2.setRole(role2);

        Emp emp3=new Emp("super","22","super");

        Set role3 = new HashSet<Role>(){{
            add(new Role("USER", emp1));
        }};
        emp3.setRole(role3);


        empDao.save(emp1);
        empDao.save(emp2);
        empDao.save(emp3);




    }

}
