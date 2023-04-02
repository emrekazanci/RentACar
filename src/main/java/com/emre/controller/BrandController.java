package com.emre.controller;

import com.emre.dto.request.SaveBrandRequestDto;
import com.emre.entity.Brand;
import com.emre.service.BrandService;
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
@RequestMapping(BRAND)
@RequiredArgsConstructor
public class BrandController {
    private final BrandService brandService;

    @PostMapping(SAVE)
    public ResponseEntity<Brand> save(SaveBrandRequestDto dto) {
        return ResponseEntity.ok(brandService.save(dto));
    }

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Brand>> findAll() {
        return ResponseEntity.ok(brandService.findAll());
    }

}
