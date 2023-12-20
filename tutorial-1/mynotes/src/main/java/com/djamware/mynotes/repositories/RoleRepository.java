/**
 * 
 */
package com.djamware.mynotes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djamware.mynotes.models.Role;

/**
 * @author RAL2BE
 *
 */


public interface RoleRepository extends JpaRepository<Role, Long> {
    
    Role findByRole(final String role);

}
