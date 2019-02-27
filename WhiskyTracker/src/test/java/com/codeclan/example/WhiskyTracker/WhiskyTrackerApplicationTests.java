package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetWhiskysFromAParticularYear(){
		List<Whisky> found = whiskyRepository.getWhiskyByYear(2018);
	}

	@Test
	public void canGetWhiskysFromAParticularYearV2(){
		List<Whisky> found = whiskyRepository.findAllWhiskysFromAYear(2018);
	}

	@Test
	public void canGetDistilleriesByRegion(){
		List<Distillery> found = distilleryRepository.getDistilleriesByRegion("Speyside");
	}

	@Test
	public void canGetDistilleriesV2(){
		List<Distillery> found = distilleryRepository.findDistilleriesForARegion("Lowland");
	}

	@Test
	public void canGetWhiskyOfCertainAgeFromCertainDistillery(){
		List<Whisky> found = whiskyRepository.findWhiskyFromSpecificDistilleryWhichIsASpecificAge("Macallan", 25);
	}







}
