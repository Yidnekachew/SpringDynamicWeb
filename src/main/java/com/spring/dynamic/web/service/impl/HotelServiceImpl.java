package com.spring.dynamic.web.service.impl;

import com.spring.dynamic.web.dao.HotelDao;
import com.spring.dynamic.web.model.Hotel;
import com.spring.dynamic.web.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelDao hotelDao;

    public Hotel get(Long id) {
        return hotelDao.get(id);
    }

    public void save(Hotel hotel) {
        hotelDao.save(hotel);
    }

    public void delete(Hotel hotel) {
        hotelDao.delete(hotel);
    }

    public List<Hotel> findAll() {
        return hotelDao.findAll();
    }
}
