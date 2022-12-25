package com.compie.webstarter.advertisements.service;

import com.compie.webstarter.advertisements.model.domain.Advertisement;

import java.util.List;

public interface AdvertisementService {
    List<Advertisement> getAdvertisement();

   Advertisement createNew(Advertisement advertisement);
}
