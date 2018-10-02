package com.gestecole.Metier;

public interface IGestEcoleMetier {
	//partir fonctionnelle
	
	//s'authentifier
	//public void authentif();
	
	//pour l'eleve
	public void cslter_eleve();
	public void modif_eleve();
	public void ajout_eleve();
	public boolean supp_eleve();
	
	//classes
	public void ajout_classe();
	public void modif_classe();
	public void cslter_classe();
	public boolean supp_classe();
	
	//pour matiere
	public void cslter_matiere();
	public void modif_matiere();
	public void ajout_matiere();
	public boolean supp_matiere();
	
	//note
	public void cslter_note();
	public void modif_note();
	public void ajout_note();
	public boolean supp_note();
	
	/*
	//resultat
	public void enreg_resultat();
	public void cslter_resultat();
	public void enreg_resultat();
	
	*/

}
