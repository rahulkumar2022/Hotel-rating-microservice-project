package com.learn.hotel.HotelService.services;

import com.learn.hotel.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService {

    Hotel createHotel(Hotel hotel);

    List<Hotel> getAll();

    Hotel get(String id);
}
