package com.compie.webstarter.advertisements.model.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AdvertisementResponseDto {
    public String content;
    public Boolean is_active;
    public Double  exposure_percentage;
}
