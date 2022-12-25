package com.compie.webstarter.advertisements.model.dto;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class AdvertisementRequestDto {
    public String name;
    public String password;
}
