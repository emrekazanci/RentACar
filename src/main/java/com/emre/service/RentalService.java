package com.emre.service;

import com.emre.dto.request.SaveRentalRequestDto;
import com.emre.entity.Rental;
import com.emre.mapper.IRentalMapper;
import com.emre.repository.IRentalRepository;
import com.emre.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class RentalService extends ServiceManager<Rental, Long> {
    private final IRentalRepository rentalRepository;

    public RentalService(IRentalRepository rentalRepository) {
        super(rentalRepository);
        this.rentalRepository = rentalRepository;
    }

    public Rental save(SaveRentalRequestDto dto) {
        return save(IRentalMapper.INSTANCE.toRental(dto));
    }
}
