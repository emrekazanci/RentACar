package com.emre.repository;

import com.emre.entity.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRentalRepository extends JpaRepository<Rental,Long> {
}
