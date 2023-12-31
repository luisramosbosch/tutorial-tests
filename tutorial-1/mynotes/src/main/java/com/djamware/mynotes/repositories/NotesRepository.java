package com.djamware.mynotes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djamware.mynotes.models.Notes;

/**
 * @author RAL2BE
 *
 */
public interface NotesRepository extends JpaRepository<Notes, Long> {
    
    Notes findByTitle(final String title);
}
