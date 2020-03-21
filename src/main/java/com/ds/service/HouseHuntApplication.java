package com.ds.service;

import com.ds.entity.Landmark;
import com.ds.entity.LandmarkType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.ds.dao")
@ComponentScan(basePackages = "com.ds")
public class HouseHuntApplication implements CommandLineRunner {

	@Autowired
	private LandmarkService landmarkService;

	public static void main(String[] args) {

		SpringApplication.run(HouseHuntApplication.class, args);
	}

	@Override
	public void run(String... args) {

		Landmark landmark = new Landmark(null, LandmarkType.WORK, "Prestige Trade Tower");
		landmarkService.save(landmark);

		Landmark office = new Landmark(null, LandmarkType.WORK, "Ecospace skywalk");
		landmarkService.save(office);

		System.out.println(landmarkService.getAll());

	}

}
