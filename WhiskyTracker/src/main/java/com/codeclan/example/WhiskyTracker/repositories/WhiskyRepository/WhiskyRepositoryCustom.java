package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {
    public List<Whisky> findAllWhiskysFromAYear(int year);
    public List<Whisky> findWhiskyFromSpecificDistilleryWhichIsASpecificAge(String name, int age);
    public List<Whisky>getAllWhiskyFromARegion(String region);
}
