package com.gestionEcole.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Note implements Serializable {
	
	@Id @GeneratedValue
	private Long id_note;
	private String type_note;

	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Note(String type_note, Matiere matiere, Collection<Eleve> eleve) {
		super();
		this.type_note = type_note;
		
	}
	public Long getId_note() {
		return id_note;
	}
	public void setId_note(Long id_note) {
		this.id_note = id_note;
	}
	public String getType_note() {
		return type_note;
	}
	public void setType_note(String type_note) {
		this.type_note = type_note;
	}
	
	
	
	}
	
	
	 

