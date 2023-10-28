package com.WomenThrive.WomenThrive.service;

import com.WomenThrive.WomenThrive.model.Units;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UnitsService {

    public Units create (Units units);

    public List<Units> getAllUnits();

    public Object getOneUnits(Integer id);

    public Object update(Units units);

    public String deleteUnits(Integer id);

    public List<Units> getSearch(String name);
}
