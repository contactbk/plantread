package com.bala.excelgen.repository;

import com.bala.excelgen.model.Plant;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Balaji on 1/10/2017.
 */
@Repository
public interface PlantRepository  extends BaseRepository<Plant,Integer>{
    List<Plant> findByName(String plantName);
}
