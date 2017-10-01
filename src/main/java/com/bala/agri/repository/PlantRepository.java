package com.bala.agri.repository;

import com.bala.agri.domain.Plant;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Balaji on 1/10/2017.
 */
@Repository
public interface PlantRepository  extends BaseRepository<Plant,Integer>{
    List<Plant> findByName(String plantName);
}
