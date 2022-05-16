package com.techniq.demo.Repositories;

import com.techniq.demo.Models.Organization;
import org.springframework.data.repository.CrudRepository;

public interface OrganizationRepository extends CrudRepository<Organization, Integer> {
}
