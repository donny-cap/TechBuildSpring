package com.techniq.demo.Repositories;

import com.techniq.demo.Models.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
}
