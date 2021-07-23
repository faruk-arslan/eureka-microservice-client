package com.fa.dogresteurekamicroservice.repository;

import com.fa.dogresteurekamicroservice.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
