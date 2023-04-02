package com.emre.service;

import com.emre.dto.request.SaveCarRequestDto;
import com.emre.entity.Car;
import com.emre.entity.join.CarColorBrand;
import com.emre.entity.join.CarCustomerRent;
import com.emre.entity.join.CarDailyPrice;
import com.emre.mapper.ICarMapper;
import com.emre.repository.ICarRepository;
import com.emre.service.join.CarColorBrandService;
import com.emre.service.join.CarCustomerRentService;
import com.emre.service.join.CarDailyPriceService;
import com.emre.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService extends ServiceManager<Car, Long> {
    private final ICarRepository carRepository;
    private final CarColorBrandService carColorBrandService;
    private final CarDailyPriceService carDailyPriceService;
    private final CarCustomerRentService carCustomerRentService;

    public CarService(ICarRepository carRepository, CarColorBrandService carColorBrandService,
                      CarDailyPriceService carDailyPriceService, CarCustomerRentService carCustomerRentService) {
        super(carRepository);
        this.carRepository = carRepository;
        this.carColorBrandService = carColorBrandService;
        this.carDailyPriceService = carDailyPriceService;
        this.carCustomerRentService = carCustomerRentService;
    }

    public Car save(SaveCarRequestDto dto) {
        return save(ICarMapper.INSTANCE.toCar(dto));
    }

    public List<Car> findAllByCarNameStartingWithIgnoreCase(String name) {
        return carRepository.findAllByCarNameStartingWithIgnoreCase(name);
    }

    public List<Car> findAllByBrandId(Long id) {
        return carRepository.findAllByBrandId(id);
    }

    public List<Car> findAllByColorId(Long id) {
        return carRepository.findAllByColorId(id);
    }

    public List<CarColorBrand> findCarColorBrand() {
        return carColorBrandService.findCarColorBrand();
    }

    public List<Car> findAllByDailyPriceLessThanEqual(double dailyPrice) {
        return carRepository.findAllByDailyPriceLessThanEqual(dailyPrice);
    }

    public List<CarDailyPrice> findCarAndDailyPrice() {
        return carDailyPriceService.findCarAndDailyPrice();
    }

    public List<CarCustomerRent> findCarCustomerRent() {
        return carCustomerRentService.findCarCustomerRent();
    }

}
