package com.emre.service;

import com.emre.dto.request.SaveRentalRequestDto;
import com.emre.entity.Rental;
import com.emre.exception.ErrorType;
import com.emre.exception.RentACarException;
import com.emre.mapper.IRentalMapper;
import com.emre.repository.IRentalRepository;
import com.emre.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Rental> findAll() {
        List<Rental> rentals = rentalRepository.findAll();
        if (rentals.isEmpty())
            throw new RentACarException(ErrorType.CAR_NOT_FOUND);
        return rentals;
    }
}
