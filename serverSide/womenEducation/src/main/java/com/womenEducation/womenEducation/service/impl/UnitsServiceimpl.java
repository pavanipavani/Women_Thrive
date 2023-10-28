package com.womenEducation.womenEducation.service.impl;

import com.womenEducation.womenEducation.model.Units;
import com.womenEducation.womenEducation.repository.UnitsRepository;
import com.womenEducation.womenEducation.service.UnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UnitsServiceimpl implements UnitsService {

    @Autowired
    UnitsRepository unitsRepository;

    @Override
    public Units create(Units units){return unitsRepository.save(units);}

    @Override
    public List<Units> getAllUnits(){return unitsRepository.findAll();}

    @Override
    public Units getOneUnit(Integer id){return unitsRepository.findById(id).get();}

    @Override
    public Units update(Units units) {return  unitsRepository.save(units);}

    @Override
    public String deleteunit(Integer id){
        UnitsRepository.deleteByid(id);
        return "Units details successfull";
    }
}
