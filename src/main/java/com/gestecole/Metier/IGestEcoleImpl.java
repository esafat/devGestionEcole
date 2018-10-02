package com.gestecole.Metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.gestionEcole.DAO.EleveRepository;
import com.gestionEcole.DAO.MatiereRepository;
import com.gestionEcole.DAO.NoteRepository;
import com.gestionEcole.DAO.ResultatRepository;
import com.gestionEcole.DAO.UserSystemeRepository;
@Service
@Transactional
public class IGestEcoleImpl implements IGestEcoleMetier {
//	
	@Autowired
	private ResultatRepository resultatRepository;
	@Autowired
	private EleveRepository eleveRepository;
	@Autowired
	private NoteRepository noteRepository;
	@Autowired
	private MatiereRepository matiereRepository;
	@Autowired
	private UserSystemeRepository userSystemeRepository;
//	
//// nous allons faiore un @overide pour definir chaque methode declzré dzns IGestEcoleMetier
//	
//	

@Override
public void cslter_eleve() {
	// TODO Auto-generated method stub
	
}

@Override
public void modif_eleve() {
	// TODO Auto-generated method stub
	
}

@Override
public void ajout_eleve() {
	// TODO Auto-generated method stub
	
}

@Override
public boolean supp_eleve() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void ajout_classe() {
	// TODO Auto-generated method stub
	
}

@Override
public void modif_classe() {
	// TODO Auto-generated method stub
	
}

@Override
public void cslter_classe() {
	// TODO Auto-generated method stub
	
}

@Override
public boolean supp_classe() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void cslter_matiere() {
	// TODO Auto-generated method stub
	
}

@Override
public void modif_matiere() {
	// TODO Auto-generated method stub
	
}

@Override
public void ajout_matiere() {
	// TODO Auto-generated method stub
	
}

@Override
public boolean supp_matiere() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void cslter_note() {
	// TODO Auto-generated method stub
	
}

@Override
public void modif_note() {
	// TODO Auto-generated method stub
	
}

@Override
public void ajout_note() {
	// TODO Auto-generated method stub
	
}

@Override
public boolean supp_note() {
	// TODO Auto-generated method stub
	return false;
}
}
