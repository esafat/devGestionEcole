package com.gestionEcole.entities;

import javax.persistence.Entity;

@Entity
public class Directeur extends UserSysteme {

	public Directeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Directeur(String nom, String prenoms, String login, String mdp, String adresse) {
		super(nom, prenoms, login, mdp, adresse);
		// TODO Auto-generated constructor stub
	}
	

}
