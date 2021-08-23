package za.ac.cput.repository;

/**
 * Author: Muhammad Yaasin Cole
 * Student Number: 218340869
 *
 */
import za.ac.cput.entity.Role;

import java.util.Set;

public interface IRoleRepository extends IRepository<Role, String>{

    public Set<Role> getAll();
}
