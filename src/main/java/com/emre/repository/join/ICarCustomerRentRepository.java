package com.emre.repository.join;

import com.emre.entity.join.CarCustomerRent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICarCustomerRentRepository extends JpaRepository<CarCustomerRent,Long> {
    @Query(nativeQuery = true,value = "SELECT r.rental_id,ca.car_name,b.brand_name,r.rent_date,cu.company_name FROM tbl_car as ca\n" +
            "INNER JOIN tbl_rental as r ON r.car_id = ca.car_id\n" +
            "INNER JOIN tbl_customer as cu ON r.customer_id = cu.customer_id\n" +
            "INNER JOIN tbl_brand as b ON ca.brand_id = b.brand_id")
    List<CarCustomerRent> findCarCustomerRent();
}
