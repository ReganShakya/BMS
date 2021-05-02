package com.voodoo.bms.repository;

import com.voodoo.bms.models.ERole;
import com.voodoo.bms.models.Role;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author regan
 */

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
