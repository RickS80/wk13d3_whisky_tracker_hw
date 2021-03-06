package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistilleryRepository extends JpaRepository<Distillery, Long>, DistilleryRepositoryCustom {

//    JPA method queries

    List<Distillery> getDistilleriesByRegion(String region);

//    Criteria Query

    List<Distillery> findDistilleriesWithTwelveYrOldWhiskys(int age);
    List<Distillery> findDistilleriesForARegion(String region);

}
