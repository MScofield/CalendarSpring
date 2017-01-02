package com.IronYard.services;

import com.IronYard.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by scofieldservices on 1/2/17.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
        User findFirstByName(String name);
}
