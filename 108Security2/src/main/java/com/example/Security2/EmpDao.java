package com.example.Security2;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpDao extends JpaRepository<Emp,Integer> {
    //Optional<Emp> findByname(String username);

    Emp findByName(String username);
}
