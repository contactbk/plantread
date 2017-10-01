package com.bala.agri.dao;

import com.bala.agri.domain.Plant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Balaji on 1/10/2017.
 */

public interface PlantDao extends CrudRepository<Plant,Integer> {
    List<Plant> findByName(String plantName);
}
