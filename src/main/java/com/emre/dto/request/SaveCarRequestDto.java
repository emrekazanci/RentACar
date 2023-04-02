package com.emre.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveCarRequestDto {
    String name;
    int modelYear;
    double dailyPrice;
    String description;
    Long colorId;
    Long brandId;
}
