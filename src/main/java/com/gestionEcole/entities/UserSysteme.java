package com.gestionEcole.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class UserSysteme implements Serializable {
	@Id @GeneratedValue
	private Long id_user;
	private String nom;
	private String prenoms;
	private String login;
	private String mdp;
	private String adresse;
	public UserSysteme() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserSysteme(String nom, String prenoms, String login, String mdp, String adresse) {
		super();
		this.nom = nom;
		this.prenoms = prenoms;
		this.login = login;
		this.mdp = mdp;
		this.adresse = adresse;
	}
	public Long getId_user() {
		return id_user;
	}
	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenoms() {
		return prenoms;
	}
	public void setPrenoms(String prenoms) {
		this.prenoms = prenoms;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
}
