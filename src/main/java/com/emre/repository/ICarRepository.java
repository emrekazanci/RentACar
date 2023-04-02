package com.emre.repository;

import com.emre.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICarRepository extends JpaRepository<Car, Long> {

    List<Car> findAllByCarNameStartingWithIgnoreCase(String name);

    List<Car> findAllByBrandId(Long id);

    List<Car> findAllByColorId(Long id);

    List<Car> findAllByDailyPriceLessThanEqual(double dailyPrice);


}
