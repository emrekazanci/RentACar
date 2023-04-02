package com.emre.mapper;

import com.emre.dto.request.SaveBrandRequestDto;
import com.emre.entity.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IBrandMapper {
    IBrandMapper INSTANCE = Mappers.getMapper(IBrandMapper.class);

    Brand toBrand(SaveBrandRequestDto dto);
}
