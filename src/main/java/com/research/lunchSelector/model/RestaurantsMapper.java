package com.research.lunchSelector.model;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by u_kino07 on 2018. 5. 22..
 */
@Mapper
@Repository
public interface RestaurantsMapper {
    List<Restaurant> getAllRestaurants();

    Restaurant getRestaurant(int id);

    int addRestaurant(Restaurant restaurant);

    int updateRestaurant(Restaurant restaurant);

    int deleteRestaurant(int id);
}
