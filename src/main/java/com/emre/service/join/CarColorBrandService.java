package com.emre.service.join;

import com.emre.entity.join.CarColorBrand;
import com.emre.repository.join.ICarColorBrandRepository;
import com.emre.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarColorBrandService extends ServiceManager<CarColorBrand, Long> {
    private final ICarColorBrandRepository carColorBrandRepository;

    public CarColorBrandService(ICarColorBrandRepository carColorBrandRepository) {
        super(carColorBrandRepository);
        this.carColorBrandRepository = carColorBrandRepository;
    }

    public List<CarColorBrand> findCarColorBrand() {
        return carColorBrandRepository.findCarColorBrand();
    }
}
