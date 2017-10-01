package com.bala.agri.controller;

import com.bala.agri.service.PlantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by balaji on 30/9/2017.
 */
@RestController
public class PlantController {

    @Autowired
    private PlantsService plantsService;

    @GetMapping(value="/plants")
    public String displayPlants(){
       String  msg=plantsService.getAllPlants();
        return msg;
    }

    @PostMapping(value="/plants")
    public String createPlant(){
        String  msg=plantsService.createNewPlant();
        return msg;
    }





}
