package com.gestionEcole.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.gestionEcole.entities.Matiere;

@Service
public interface MatiereRepository extends  JpaRepository<Matiere, Long> {

}
