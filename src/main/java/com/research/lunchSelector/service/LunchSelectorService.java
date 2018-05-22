package com.research.lunchSelector.service;

import com.research.lunchSelector.model.Restaurant;
import com.research.lunchSelector.model.RestaurantsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * Created by u_kino07 on 2018. 5. 22..
 */
@Service
public class LunchSelectorService {
    @Autowired
    private RestaurantsMapper restaurantsMapper;

    public String getMessage() {
        List<Restaurant> restaurants = restaurantsMapper.getAllRestaurants();
        Random random = new Random();
        Restaurant restaurant = restaurants.get(random.nextInt(restaurants.size()));
        return restaurant.getName() + "으로 " + restaurant.getOpenAt() + " ~ " + restaurant.getCloseAt() + " 사이에 가요!!";
    }
}
