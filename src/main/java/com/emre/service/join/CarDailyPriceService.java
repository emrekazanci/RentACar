package com.emre.service.join;

import com.emre.entity.join.CarDailyPrice;
import com.emre.repository.join.ICarDailyPriceRepository;
import com.emre.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarDailyPriceService extends ServiceManager<CarDailyPrice, Long> {
    private final ICarDailyPriceRepository icarDailyPriceRepository;

    public CarDailyPriceService(ICarDailyPriceRepository iCarDailyPriceRepository) {
        super(iCarDailyPriceRepository);
        this.icarDailyPriceRepository = iCarDailyPriceRepository;
    }

    public List<CarDailyPrice> findCarAndDailyPrice() {
        return icarDailyPriceRepository.findCarAndDailyPrice();
    }
}
