package com.gestionEcole.entities;

import javax.persistence.Entity;

@Entity
public class Enseignant extends UserSysteme {
	private String mat_enseigne;

	
	public Enseignant(String nom, String prenoms, String login, String mdp, String adresse) {
		super(nom, prenoms, login, mdp, adresse);
		// TODO Auto-generated constructor stub
	}


	public Enseignant(String mat_enseigne) {
		super();
		this.mat_enseigne = mat_enseigne;
	}


	public String getMat_enseigne() {
		return mat_enseigne;
	}


	public void setMat_enseigne(String mat_enseigne) {
		this.mat_enseigne = mat_enseigne;
	}

}
