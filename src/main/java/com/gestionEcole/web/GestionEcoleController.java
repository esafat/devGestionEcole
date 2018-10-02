package com.gestionEcole.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestionEcole.DAO.EleveRepository;
import com.gestionEcole.DAO.MatiereRepository;
import com.gestionEcole.DAO.NoteRepository;
import com.gestionEcole.DAO.ResultatRepository;
import com.gestionEcole.DAO.UserSystemeRepository;
import com.gestionEcole.entities.Eleve;
import com.gestionEcole.entities.Matiere;
import com.gestionEcole.entities.Note;
import com.gestionEcole.entities.Resultat;

//souffrer de trouver tout l'api rassemblé ici

@RestController
@RequestMapping("/api")
public class GestionEcoleController {
	//les injections et les anotation pour les lmethodes basics
	
	/*	
	//operations sur les eleves
	@Autowired
	private EleveRepository eleveRepository;
	@GetMapping("/eleves")
	public List<Eleve> cslter_eleve(){
		return eleveRepository.findAll();
	}
	@GetMapping("/eleves/{id}")
	public Optional<Eleve> cslter_eleve(@PathVariable Long id) {
		return eleveRepository.findById(id);
	}
	@DeleteMapping("/eleves/{id}")
	public boolean suppr_eleve(@PathVariable Long id) {
		eleveRepository.deleteById(id);
		return true;
	}
	@PostMapping("/eleves")
	public Eleve ajout_eleve(Eleve eleve) {
		return eleveRepository.save(eleve);
	}
	
	@PostMapping("/eleves")
	public Eleve modif_eleve(Eleve eleve) {
		return eleveRepository.save(eleve);
	}
	
	
	
	
	//operation sur les notes 
         
	@Autowired
	private NoteRepository noteRepository;
	@GetMapping("/notes")
	public List<Note> cslter_note(){
		return noteRepository.findAll();
	}
	@GetMapping("/notes/{id}")
	public Optional<Note> cslter_note(@PathVariable Long id) {
		return noteRepository.findById(id);
	}
	@DeleteMapping("notes/{id}")
	public boolean suppr_note(@PathVariable Long id) {
		noteRepository.deleteById(id);
		return true;
	}
	@PostMapping("/notes")
	public Note ajout_note(Note note) {
		return noteRepository.save(note);
	}
	
	@PostMapping("/notes")
	public Note modif_note(Note note) {
		return noteRepository.save(note);
	}
	
	
	//operations syur les matieresv
	
	@Autowired
	private MatiereRepository matiereRepository;
	@GetMapping("/matieres")
	public List<Matiere> cslter_matiere(){
		return matiereRepository.findAll();
	}
	@GetMapping("/matieres/{id}")
	public Optional<Matiere> cslter_matiere(@PathVariable Long id) {
		return matiereRepository.findById(id);
	}
	@DeleteMapping("/notes/{id}")
	public boolean suppr_matiere(@PathVariable Long id) {
		matiereRepository.deleteById(id);
		return true;
	}
	@PostMapping("/matieres")
	public Matiere ajout_matiere(Matiere matiere) {
		return matiereRepository.save(matiere);
	}
	
	@PostMapping("/matiere")
	public Matiere modif_matiere(Matiere matiere) {
		return matiereRepository.save(matiere);
	}
	

	
	//operations sur les resultats et execution des operation
	@Autowired
	private ResultatRepository resultatRepository;
	
	@GetMapping("/resultats")
	public List<Resultat> cslter_resltat(){
	return resultatRepository.findAll();
	}
	@GetMapping("/resultats/{id}")
	public Optional<Resultat> cslter_resultat(@PathVariable Long id) {
		return resultatRepository.findById(id);
	}
	@DeleteMapping("resultats/{id}")
	public boolean suppr_resultat(@PathVariable Long id) {
		resultatRepository.deleteById(id);
		return true;
	}
	@PostMapping("/resultats")
	public Resultat ajout_resultat(Resultat resultat) {
		return resultatRepository.save(resultat);
	}
	
	@PostMapping("/notes")
	public Resultat modif_resultat(Resultat resultat) {
		return resultatRepository.save(resultat);
	}
//	
	
	
	
	@Autowired
	private UserSystemeRepository userSystemeRepository;
	
	/*
	@GetMapping("/userSysteme")
	public List<UserSystemeRepository> cslter_note(){
		return noteRepository.findAll();
	}
	@GetMapping("/userSysteme/{id}")
	public Optional<Note> cslter_note(@PathVariable Long id) {
		return noteRepository.findById(id);
	}
	@DeleteMapping("/userSysteme/{id}")
	public boolean suppr_note(@PathVariable Long id) {
		noteRepository.deleteById(id);
		return true;
	}
	@PostMapping("/userSysteme")
	public Note ajout_note(Note note) {
		return noteRepository.save(note);
	}
	
	@PostMapping("/userSysteme")
	public Note modif_note(Note note) {
		return noteRepository.save(note);
	}
	*/

}
