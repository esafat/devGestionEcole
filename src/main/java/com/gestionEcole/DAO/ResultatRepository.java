package com.gestionEcole.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionEcole.entities.Resultat;

public interface ResultatRepository extends JpaRepository<Resultat, Long> {

}
