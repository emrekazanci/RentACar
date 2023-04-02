package com.emre.mapper;

import com.emre.dto.request.SaveColorRequestDto;
import com.emre.entity.Color;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IColorMapper {
    IColorMapper INSTANCE = Mappers.getMapper(IColorMapper.class);

    Color toColor(SaveColorRequestDto dto);
}
