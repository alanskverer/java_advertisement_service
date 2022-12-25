package com.compie.webstarter.advertisements.repository;

import com.compie.webstarter.advertisements.model.domain.Advertisement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvertisementRepository extends CrudRepository<Advertisement, Integer> {

    List<Advertisement> findAll();
    Advertisement save(Advertisement advertisement);
}