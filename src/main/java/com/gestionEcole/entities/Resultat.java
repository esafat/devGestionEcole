package com.gestionEcole.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Resultat {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_resultat;
	@OneToMany
	private Collection<Eleve> eleve;
	public Resultat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Resultat(Collection<Eleve> eleve) {
		super();
		this.eleve = eleve;
		
	}
	public Long getId_resultat() {
		return id_resultat;
	}
	public void setId_resultat(Long id_resultat) {
		this.id_resultat = id_resultat;
	}
	public Collection<Eleve> getEleve() {
		return eleve;
	}
	public void setEleve(Collection<Eleve> eleve) {
		this.eleve = eleve;
	}

}