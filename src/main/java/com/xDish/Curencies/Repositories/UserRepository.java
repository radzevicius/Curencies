package com.xDish.Curencies.Repositories;

import com.xDish.Curencies.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    Optional<User> findByUserName(String username);
}
