package com.compie.webstarter.advertisements.service;

import com.compie.webstarter.advertisements.model.domain.Advertisement;
import com.compie.webstarter.advertisements.repository.AdvertisementRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class AdvertisementServiceImpl implements AdvertisementService {

    private final AdvertisementRepository advertisementRepository;

    @Override
    public List<Advertisement> getAdvertisement() {
        log.info("getting advertisement");
        return advertisementRepository.findAll();
    }

    @Override
    public Advertisement createNew(Advertisement user) {
        log.info("creating new user");
        return advertisementRepository.save(user);
    }
}
