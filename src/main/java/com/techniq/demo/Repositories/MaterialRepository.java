package com.techniq.demo.Repositories;

import com.techniq.demo.Models.Material;
import org.springframework.data.repository.CrudRepository;

public interface MaterialRepository extends CrudRepository<Material, Integer> {
}
