package com.djamware.mynotes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djamware.mynotes.models.User;

/**
 * @author RAL2BE
 *
 */



public interface UserRepository extends JpaRepository<User, Long> {
    
    User findByEmail(final String email);

}
