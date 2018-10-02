package com.gestionEcole.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Matiere implements Serializable {
	@Id @GeneratedValue
	private Long id_matiere;
	private String nom_matiere;
	private String coef_mlatiere;
	@OneToMany
	private Collection<Classe> classe;
 	public Matiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Matiere(String nom_matiere, String coef_mlatiere, Collection<Classe> classe) {
		super();
		
		this.nom_matiere = nom_matiere;
		this.coef_mlatiere = coef_mlatiere;
		this.classe=classe;
	}
	public Long getId_matiere() {
		return id_matiere;
	}
	public void setId_matiere(Long id_matiere) {
		this.id_matiere = id_matiere;
	}
	public String getNom_matiere() {
		return nom_matiere;
	}
	public void setNom_matiere(String nom_matiere) {
		this.nom_matiere = nom_matiere;
	}
	public String getCoef_mlatiere() {
		return coef_mlatiere;
	}
	public void setCoef_mlatiere(String coef_mlatiere) {
		this.coef_mlatiere = coef_mlatiere;
	}
	public Collection<Classe> getClasse() {
		return classe;
	}
	public void setClasse(Collection<Classe> classe) {
		this.classe = classe;
	}
	

}
