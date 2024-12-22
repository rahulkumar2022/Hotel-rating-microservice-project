package com.learn.rating.RatingService.services;


import com.learn.rating.RatingService.entities.Rating;

import java.util.List;

public interface RatingServices {

    Rating createRating(Rating rating);

    List<Rating> allRatings();

    List<Rating> getRatingByUserId(String userId);

    List<Rating> getRatingByHotelId(String hotelId);
}
