package com.emre.controller;

import com.emre.dto.request.SaveCarRequestDto;
import com.emre.entity.Car;
import com.emre.entity.join.CarColorBrand;
import com.emre.entity.join.CarCustomerRent;
import com.emre.entity.join.CarDailyPrice;
import com.emre.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.emre.constant.EndPointList.*;

@RestController
@RequestMapping(CAR)
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @PostMapping(SAVE)
    public ResponseEntity<Car> save(@RequestBody SaveCarRequestDto dto) {
        return ResponseEntity.ok(carService.save(dto));
    }

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Car>> findAll() {
        return ResponseEntity.ok(carService.findAll());
    }

    @GetMapping(FIND_ALL_CAR_NAME_STARTING)
    public ResponseEntity<List<Car>> findAllByCarNameStartingWithIgnoreCase(String name) {
        return ResponseEntity.ok(carService.findAllByCarNameStartingWithIgnoreCase(name));
    }

    @GetMapping(FIND_ALL_CAR_BRAND_ID)
    public ResponseEntity<List<Car>> findAllByBrandId(Long id) {
        return ResponseEntity.ok(carService.findAllByBrandId(id));
    }

    @GetMapping(FIND_ALL_CAR_COLOR_ID)
    public ResponseEntity<List<Car>> findAllByColorId(Long id) {
        return ResponseEntity.ok(carService.findAllByColorId(id));
    }

    @GetMapping(FIND_CAR_COLOR_BRAND)
    public ResponseEntity<List<CarColorBrand>> findCarColorBrand() {
        return ResponseEntity.ok(carService.findCarColorBrand());
    }

    @GetMapping(FIND_CAR_DAILY_PRICE_LESS_THAN)
    public ResponseEntity<List<Car>> findAllByDailyPriceLessThanEqual(double dailyPrice) {
        return ResponseEntity.ok(carService.findAllByDailyPriceLessThanEqual(dailyPrice));
    }

    @GetMapping(FIND_CAR_RENT_DAILY_PRICE)
    public ResponseEntity<List<CarDailyPrice>> findCarAndDailyPrice() {
        return ResponseEntity.ok(carService.findCarAndDailyPrice());
    }

    @GetMapping(FIND_CAR_CUSTOMER_RENT)
    public ResponseEntity<List<CarCustomerRent>> findCarCustomerRent() {
        return ResponseEntity.ok(carService.findCarCustomerRent());
    }
}
