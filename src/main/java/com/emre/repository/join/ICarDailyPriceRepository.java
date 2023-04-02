package com.emre.repository.join;

import com.emre.entity.join.CarDailyPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICarDailyPriceRepository extends JpaRepository<CarDailyPrice, Long> {
    @Query(nativeQuery = true, value = "SELECT r.rental_id,ca.car_name,ca.daily_price,ca.description FROM tbl_car as ca \n" +
            "INNER JOIN tbl_rental as r ON r.car_id = ca.car_id ")
    List<CarDailyPrice> findCarAndDailyPrice();
}
