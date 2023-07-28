package com.womenEducation.womenEducation.repository;

import com.womenEducation.womenEducation.model.Units;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnitsRepository extends JpaRepository<Units,Integer> {

    static void deleteByid(Integer id) {
    }
}
