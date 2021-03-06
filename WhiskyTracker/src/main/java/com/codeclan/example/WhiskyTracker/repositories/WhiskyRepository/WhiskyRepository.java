package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long>, WhiskyRepositoryCustom {



//      JPA method queries
    List<Whisky> getWhiskyByYear(int year);
    List<Whisky> findWhiskyByDistilleryIdAndAge(Long distilleryId, int age);


//      Criteria queries

    List<Whisky> findAllWhiskysFromAYear(int year);
    List<Whisky> findWhiskyFromSpecificDistilleryWhichIsASpecificAge(String name, int age);
    List<Whisky> getAllWhiskyFromARegion(String region);
}
