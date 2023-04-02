package com.emre.service;

import com.emre.dto.request.SaveColorRequestDto;
import com.emre.entity.Color;
import com.emre.mapper.IColorMapper;
import com.emre.repository.IColorRepository;
import com.emre.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class ColorService extends ServiceManager<Color, Long> {
    private final IColorRepository colorRepository;

    public ColorService(IColorRepository colorRepository) {
        super(colorRepository);
        this.colorRepository = colorRepository;
    }

    public Color save(SaveColorRequestDto dto) {
        return save(IColorMapper.INSTANCE.toColor(dto));
    }
}
