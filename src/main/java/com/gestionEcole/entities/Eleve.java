package com.gestionEcole.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Eleve implements Serializable {
		
		@Id 
		@GeneratedValue
		private Long id_eleve;
		private String mat_eleve;
		private String datenai_eleve;
		private String nom_eleve;
		private String prenom_eleve;
		private String niveau_eleve;
		public Eleve() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Eleve(String mat_eleve, String datenai_eleve, String nom_eleve, String prenom_eleve, String niveau_eleve) {
			super();
			this.mat_eleve = mat_eleve;
			this.datenai_eleve= datenai_eleve;
			this.nom_eleve = nom_eleve;
			this.prenom_eleve = prenom_eleve;
			this.niveau_eleve = niveau_eleve;
		}
		public String getDatenai_eleve() {
			return datenai_eleve;
		}
		public void setDatenai_eleve(String datenai_eleve) {
			this.datenai_eleve = datenai_eleve;
		}
		public Long getId_eleve() {
			return id_eleve;
		}
		public void setId_eleve(Long id_eleve) {
			this.id_eleve = id_eleve;
		}
		public String getMat_eleve() {
			return mat_eleve;
		}
		public void setMat_eleve(String mat_eleve) {
			this.mat_eleve = mat_eleve;
		}
		public String getNom_eleve() {
			return nom_eleve;
		}
		public void setNom_eleve(String nom_eleve) {
			this.nom_eleve = nom_eleve;
		}
		public String getPrenom_eleve() {
			return prenom_eleve;
		}
		public void setPrenom_eleve(String prenom_eleve) {
			this.prenom_eleve = prenom_eleve;
		}
		public String getNiveau_eleve() {
			return niveau_eleve;
		}
		public void setNiveau_eleve(String niveau_eleve) {
			this.niveau_eleve = niveau_eleve;
		}
		
		
		
		
		
}
