package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping (value = "/{year}")
    public List<Whisky> whiskiesByYear(@PathVariable int year) {
        return whiskyRepository.findAllWhiskysFromAYear(year);
    }

    @GetMapping (value = "/filtered/{name}/{age}")
    public List<Whisky> whiskiesByDistilleryAndAge(@PathVariable String name, @PathVariable int age){
        return whiskyRepository.findWhiskyFromSpecificDistilleryWhichIsASpecificAge(name, age);
    }

    @GetMapping (value = "/distilleries/{region}")
    public List<Whisky> whiskyByRegion(@PathVariable String region){
        return whiskyRepository.getAllWhiskyFromARegion(region);
    }



}
