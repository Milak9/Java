package com.restApi.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetsRepository extends CrudRepository<Asset, Long> {
}
