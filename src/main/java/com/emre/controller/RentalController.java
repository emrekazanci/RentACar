package com.emre.controller;

import com.emre.dto.request.SaveRentalRequestDto;
import com.emre.entity.Rental;
import com.emre.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

import static com.emre.constant.EndPointList.*;

@RestController
@RequestMapping(RENTAL)
@RequiredArgsConstructor
public class RentalController {
    private final RentalService rentalService;

    @PostMapping(SAVE)
    public ResponseEntity<Rental> save(@RequestBody @Valid SaveRentalRequestDto dto) {
        return ResponseEntity.ok(rentalService.save(dto));
    }

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Rental>> findAll() {
        return ResponseEntity.ok(rentalService.findAll());
    }
}
