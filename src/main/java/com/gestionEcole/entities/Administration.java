package com.gestionEcole.entities;

import javax.persistence.Entity;

@Entity
public class Administration extends UserSysteme {
	
	public Administration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administration(String nom, String prenoms, String login, String mdp, String adresse) {
		super(nom, prenoms, login, mdp, adresse);
		// TODO Auto-generated constructor stub
	}

}
