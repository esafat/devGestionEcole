package com.gestionEcole.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Classe implements Serializable {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_classe;
	private String nom_classe;
	private String niveau_classe;
	@ManyToMany
	private Collection<Eleve> eleve;
	@ManyToMany
	private Collection<Enseignant> enseignant;
	@OneToMany(mappedBy="nom_matiere")
	private Collection<Matiere> matiere;
	public Classe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getId_classe() {
		return id_classe;
	}

	public void setId_classe(Long id_classe) {
		this.id_classe = id_classe;
	}

	public String getNom_classe() {
		return nom_classe;
	}

	public void setNom_classe(String nom_classe) {
		this.nom_classe = nom_classe;
	}

	public String getNiveau_classe() {
		return niveau_classe;
	}

	public void setNiveau_classe(String niveau_classe) {
		this.niveau_classe = niveau_classe;
	}

	public Collection<Eleve> getEleve() {
		return eleve;
	}

	public void setEleve(Collection<Eleve> eleve) {
		this.eleve = eleve;
	}

	public Collection<Enseignant> getEnseignant() {
		return enseignant;
	}

	public Classe( String nom_classe, String niveau_classe, Collection<Eleve> eleve,
			Collection<Enseignant> enseignant, Collection<Matiere> matiere) {
		super();
		
		this.nom_classe = nom_classe;
		this.niveau_classe = niveau_classe;
		this.eleve = eleve;
		this.enseignant = enseignant;
		this.matiere = matiere;
	}
	public void setEnseignant(Collection<Enseignant> enseignant) {
		this.enseignant = enseignant;
	}
	public Collection<Matiere> getMatiere() {
		return matiere;
	}
	public void setMatiere(Collection<Matiere> matiere) {
		this.matiere = matiere;
	}
	
}
