package com.emre.service.join;

import com.emre.entity.join.CarCustomerRent;
import com.emre.repository.join.ICarCustomerRentRepository;
import com.emre.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarCustomerRentService extends ServiceManager<CarCustomerRent, Long> {
    private final ICarCustomerRentRepository iCarCustomerRentRepository;

    public CarCustomerRentService(ICarCustomerRentRepository iCarCustomerRentRepository) {
        super(iCarCustomerRentRepository);
        this.iCarCustomerRentRepository = iCarCustomerRentRepository;
    }

    public List<CarCustomerRent> findCarCustomerRent() {
        return iCarCustomerRentRepository.findCarCustomerRent();
    }
}
