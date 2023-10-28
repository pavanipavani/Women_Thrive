package com.WomenThrive.WomenThrive.repository;

import com.WomenThrive.WomenThrive.model.Units;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UnitsRepository extends JpaRepository<Units ,Integer> {
    @Query("select l from Units l where l.units_NAME like %?1%")
    List<Units>getSearch(String name);

}
