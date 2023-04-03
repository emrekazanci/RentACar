package com.emre.service;

import com.emre.dto.request.SaveBrandRequestDto;
import com.emre.entity.Brand;
import com.emre.exception.ErrorType;
import com.emre.exception.RentACarException;
import com.emre.mapper.IBrandMapper;
import com.emre.repository.IBrandRepository;
import com.emre.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandService extends ServiceManager<Brand, Long> {
    private final IBrandRepository brandRepository;

    public BrandService(IBrandRepository brandRepository) {
        super(brandRepository);
        this.brandRepository = brandRepository;
    }

    public Brand save(SaveBrandRequestDto dto) {
        return save(IBrandMapper.INSTANCE.toBrand(dto));
    }

    public List<Brand> findAll() {
        List<Brand> brands = brandRepository.findAll();
        if (brands.isEmpty())
            throw new RentACarException(ErrorType.BRAND_NOT_FOUND);
        return brands;
    }

    public Optional<Brand> findById(Long id) {
        return brandRepository.findById(id);
    }
}
