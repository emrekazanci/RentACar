package com.emre.controller;

import com.emre.dto.request.SaveColorRequestDto;
import com.emre.entity.Color;
import com.emre.service.ColorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static com.emre.constant.EndPointList.*;

@RestController
@RequestMapping(COLOR)
@RequiredArgsConstructor
public class ColorController {
    private final ColorService colorService;

    @PostMapping(SAVE)
    public ResponseEntity<Color> save(SaveColorRequestDto dto) {
        return ResponseEntity.ok(colorService.save(dto));
    }

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Color>> findAll() {
        return ResponseEntity.ok(colorService.findAll());
    }

}
