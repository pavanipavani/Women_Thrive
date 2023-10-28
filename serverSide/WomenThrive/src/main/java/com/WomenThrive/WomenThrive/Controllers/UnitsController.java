package com.WomenThrive.WomenThrive.Controllers;

import com.WomenThrive.WomenThrive.model.Units;
import com.WomenThrive.WomenThrive.service.UnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Units")
public class UnitsController {

    @Autowired
    UnitsService unitsService;

    @PostMapping("/create")
    public Units create(@RequestBody Units units){
        return unitsService.create(units);
    }
    @GetMapping("")
    public List<Units>getAllUnits(){
        return unitsService.getAllUnits();
    }
    @GetMapping("/{id}")
    public Object getOneUnits(@PathVariable Integer id){
        return unitsService.getOneUnits(id);
    }

    @PutMapping("/update")
    public Object update(@RequestBody Units units){
        return unitsService.update(units);
    }
    @DeleteMapping("/{id}")
    public String deleteUnits(@PathVariable Integer id){
        return unitsService.deleteUnits(id);
    }
    @GetMapping("/search")
    public List<Units>getSearch(@RequestParam("query") String name){
        return unitsService.getSearch(name);
    }
}
