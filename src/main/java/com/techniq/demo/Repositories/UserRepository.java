package com.techniq.demo.Repositories;

import com.techniq.demo.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
