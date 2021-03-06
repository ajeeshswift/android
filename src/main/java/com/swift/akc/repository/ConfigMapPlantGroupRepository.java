package com.swift.akc.repository;

import com.swift.akc.entity.ConfigMapPlantGroup;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigMapPlantGroupRepository extends BaseJpaRepository<ConfigMapPlantGroup,Integer> {

   @Query("SELECT g FROM ConfigMapPlantGroup g WHERE g.plantId=:plantId AND g.isActive=1")
   ConfigMapPlantGroup findByPlantId(Integer plantId);

}
