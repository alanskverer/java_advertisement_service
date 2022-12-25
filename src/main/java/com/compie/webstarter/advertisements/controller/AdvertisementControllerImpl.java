package com.compie.webstarter.advertisements.controller;

import com.compie.webstarter.advertisements.model.domain.Advertisement;
import com.compie.webstarter.advertisements.model.dto.AdvertisementResponseDto;
import com.compie.webstarter.advertisements.service.AdvertisementService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AdvertisementControllerImpl implements AdvertisementController {

    private final AdvertisementService advertisementService;

    @GetMapping
    public List<AdvertisementResponseDto> get() {
        log.info("Advertisement log from AdvertisementController");
        final List<Advertisement> advertisements = advertisementService.getAdvertisement();
        log.info("getAdvertisement response: {}", advertisements);
        return advertisements
                .stream()
                .map(advertisement -> AdvertisementResponseDto.builder()
                        .content(advertisement.getContent())
                        .is_active(advertisement.getIs_active())
                        .exposure_percentage(advertisement.getExposure_percentage())
                        .build())
                .collect(Collectors.toList());
    }

//    @Override
//    public AdvertisementResponseDto post(AdvertisementRequestDto advertisementRequestDto) {
//        Advertisement advertisement = Advertisement.builder()
//                .name(advertisementRequestDto.getName())
//                .email(advertisementRequestDto.getEmail())
//                .password(advertisementRequestDto.password)
//                .build();
//        final Advertisement savedAdvertisement = advertisementService.createNew(advertisement);
//        return AdvertisementResponseDto.builder()
//                .name(savedAdvertisement.getName())
//                .email(savedAdvertisement.getEmail())
//                .build();
//    }

//    @Override
//    public ExampleResponseDto post(UserRequestDto advertisementRequestDto) {
//        return null;
//    }

//    @Override
//    @PostMapping()
//    public UserResponseDto post(@Valid @RequestBody final UserRequestDto advertisementRequestDto) {
//        User advertisement = User.builder()
//                .name(advertisementRequestDto.getName())
//                .email(advertisementRequestDto.getEmail())
//                .password(advertisementRequestDto.password)
//                .build();
//        final User savedUser = advertisementService.createNew(advertisement);
//        return UserResponseDto.builder()
//                .name(savedUser.getName())
//                .email(savedUser.getEmail())
//                .build();
//    }
}