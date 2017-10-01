package com.bala.agri.controller;

import com.bala.agri.service.PlantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by balaji on 30/9/2017.
 */
@RestController
public class PlantController {

    @Autowired
    private PlantsService plantsService;

    @RequestMapping(value="/plants", method = RequestMethod.GET)
    public String reconcilePlant(){

       String  msg=plantsService.getAllPlants();
        return msg;
    }



}
