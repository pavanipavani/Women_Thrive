package com.womenEducation.womenEducation.controllers;

import com.womenEducation.womenEducation.model.Units;
import com.womenEducation.womenEducation.service.UnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/units")
public class UntisController {
    @Autowired
    UnitsService UnitsService;
    @PostMapping("/create")
    public Units create(@RequestBody Units Units) {return UnitsService.create(Units);}

    @GetMapping ("")
    public List<Units>getAllUnits(){return  UnitsService.getAllUnits();}

    @GetMapping ("/{id}")
    public Units getOneUnit(@PathVariable Integer id) {return UnitsService.getOneUnit(id);}

    @PutMapping ("/update")
    public Units update (@RequestBody Units Units){return UnitsService.update(Units);}

    @DeleteMapping("/{id}")
    public String deleteunit(@PathVariable Integer id) {return UnitsService.deleteunit(id);}
}
