package com.WomenThrive.WomenThrive.service.impl;

import com.WomenThrive.WomenThrive.model.Units;
import com.WomenThrive.WomenThrive.repository.UnitsRepository;
import com.WomenThrive.WomenThrive.service.UnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitsServiceImpl implements UnitsService {

    @Autowired
    UnitsRepository unitsRepository;

    @Override
    public Units create(Units units){return unitsRepository.save(units);}

    @Override
    public List<Units> getAllUnits(){return unitsRepository.findAll();}

    @Override
    public Units getOneUnits(Integer id){return unitsRepository.findById(id).get();}

    @Override
    public Units update(Units units){return unitsRepository.save(units);}

    @Override
    public String deleteUnits(Integer id){unitsRepository.deleteById(id);
        return "units is deleted successfully";
    }

    @Override

    public List<Units>getSearch(String name){return unitsRepository.getSearch(name);}
}
