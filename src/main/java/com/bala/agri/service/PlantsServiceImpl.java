package com.bala.agri.service;

import com.bala.agri.dao.PlantDao;
import com.bala.agri.domain.Plant;
import com.bala.agri.model.PlantDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by openc on 30/9/2017.
 */
@Service
@Transactional
public class PlantsServiceImpl implements  PlantsService{
    @Autowired
    private PlantDao plantDao;

    @Override
    public String getAllPlants() {
        PlantDTO plantDto=new PlantDTO();

        List<Plant> plantList=new ArrayList<>();
        String msg=null;
        plantDao.findAll().forEach((plant -> {
              plantList.add(plant);
          }));
        if(!plantList.isEmpty()){
            msg="Data retrieved successfully";
            plantList.forEach(plantRecord->{
                plantDto.setName(plantRecord.getName());
                plantDto.setType(plantRecord.getType());
                plantDto.setCategory(plantRecord.getCategory());
                plantDto.setPrice(plantRecord.getPrice());

                System.out.println("plantRecord.getName() = " + plantRecord.getName());
                System.out.println("plantRecord.getCategory() = " + plantRecord.getCategory());
                System.out.println("plantRecord.getType() = " + plantRecord.getType());
                System.out.println("plantRecord.getPrice() = " + plantRecord.getPrice());
            });
        }
        return msg;
    }
}
