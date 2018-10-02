package com.gestionEcole.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionEcole.entities.Note;

public interface NoteRepository extends JpaRepository<Note, Long>{
}
