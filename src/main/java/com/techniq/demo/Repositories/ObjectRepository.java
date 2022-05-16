package com.techniq.demo.Repositories;

import com.techniq.demo.Models.Object;
import org.springframework.data.repository.CrudRepository;

public interface ObjectRepository extends CrudRepository<Object, Integer> {
}
