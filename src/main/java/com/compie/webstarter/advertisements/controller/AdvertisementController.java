package com.compie.webstarter.advertisements.controller;

import com.compie.webstarter.advertisements.model.dto.AdvertisementRequestDto;
import com.compie.webstarter.advertisements.model.dto.AdvertisementResponseDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Advertisement Controller")
@RestController
@RequestMapping("/v1/advertisement")
@Validated
public interface AdvertisementController {

    @GetMapping
    List<AdvertisementResponseDto> get();

//    @PostMapping()
//    AdvertisementResponseDto post(@RequestBody AdvertisementRequestDto userRequestDto);
}

