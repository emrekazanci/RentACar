package com.emre.repository.join;

import com.emre.entity.join.CarColorBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICarColorBrandRepository extends JpaRepository<CarColorBrand,Long> {
    @Query(value = "SELECT ca.car_id,ca.car_name,co.color_name,b.brand_name FROM tbl_car as ca\n" +
            "INNER JOIN tbl_color as co ON co.color_id = ca.color_id\n" +
            "INNER JOIN tbl_brand as b ON b.brand_id = ca.brand_id", nativeQuery = true)
    List<CarColorBrand> findCarColorBrand();
}
