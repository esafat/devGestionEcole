package com.gestionEcole.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gestionEcole.entities.Eleve;



public interface EleveRepository extends JpaRepository<Eleve, Long> {
	

}
