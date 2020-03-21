package com.ds.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    @Id
    private String id;
    private ProjectType projectType;

    private double projectSize;
    private double openArea;
    private int numberOfUnits;

    private Date possessionDate;
    private double googleReviewRating;

    private Pricing pricing;
    private int numberOfFloors;

    private UnitInMind unitInMind;

    private List<LandmarkDistance> distanceFromLandMarks;


}
