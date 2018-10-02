package com.gestionEcole.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionEcole.entities.UserSysteme;

public interface UserSystemeRepository extends JpaRepository<UserSysteme,Long> {

}
