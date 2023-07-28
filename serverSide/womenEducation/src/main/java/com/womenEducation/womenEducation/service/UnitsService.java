package com.womenEducation.womenEducation.service;

import com.womenEducation.womenEducation.model.Units;
import com.womenEducation.womenEducation.repository.UnitsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UnitsService {

    public Units create(Units Units);

    public List<Units> getAllUnits();

    public Units getOneUnit(Integer id);

    public Units update(Units Units);

    public String deleteunit(Integer id);

}
