package com.emre.mapper;

import com.emre.dto.request.SaveCarRequestDto;
import com.emre.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ICarMapper {
    ICarMapper INSTANCE = Mappers.getMapper(ICarMapper.class);

    Car toCar(SaveCarRequestDto dto);
}
