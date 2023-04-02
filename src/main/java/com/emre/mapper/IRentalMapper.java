package com.emre.mapper;

import com.emre.dto.request.SaveRentalRequestDto;
import com.emre.entity.Rental;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IRentalMapper {
    IRentalMapper INSTANCE = Mappers.getMapper(IRentalMapper.class);

    Rental toRental(SaveRentalRequestDto dto);
}
