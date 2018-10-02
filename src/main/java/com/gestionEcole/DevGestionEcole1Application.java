package com.gestionEcole;

import javax.persistence.AssociationOverride;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gestionEcole.DAO.EleveRepository;
import com.gestionEcole.DAO.MatiereRepository;
import com.gestionEcole.DAO.NoteRepository;
import com.gestionEcole.DAO.ResultatRepository;
import com.gestionEcole.DAO.UserSystemeRepository;
import com.gestionEcole.entities.Eleve;

@SpringBootApplication
public class DevGestionEcole1Application implements CommandLineRunner {
	@Autowired
	private EleveRepository eleveRepository;
	@Autowired
	private NoteRepository noteRepository;
	@Autowired
	private MatiereRepository matiereRepository;
	@Autowired
	private ResultatRepository resultatRepository;
	@Autowired
	private UserSystemeRepository userSystemeRepository;

	public static void main(String[] args) {
		SpringApplication.run(DevGestionEcole1Application.class, args);
		
		
	}
	@Override
	public void run(String... args)throws Exception{
		eleveRepository.save(new Eleve("CE878878","20-15-2018", "tia","franck","5eme10"));
		eleveRepository.save(new Eleve("CE1878878","28-15-2018", "kouame","fidele","3eme5"));
		
	}
	
}
