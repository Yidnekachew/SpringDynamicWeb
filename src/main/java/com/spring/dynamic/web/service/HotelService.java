package com.spring.dynamic.web.service;

import com.spring.dynamic.web.model.Hotel;

import java.util.List;

public interface HotelService {

    Hotel get(Long id);

    void save(Hotel hotel);

    void delete(Hotel hotel);

    List<Hotel> findAll();

}
