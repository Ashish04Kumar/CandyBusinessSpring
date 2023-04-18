package com.example.RegisterLogin.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.RegisterLogin.Entity.ContactUs;
import com.example.RegisterLogin.Entity.Employee;

@EnableJpaRepositories
@Repository
public interface contactRepo extends JpaRepository<ContactUs, Integer>{

}
