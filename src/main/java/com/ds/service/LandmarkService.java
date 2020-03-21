package com.ds.service;

import com.ds.entity.Landmark;

import java.util.List;


public interface LandmarkService {

    Landmark save(Landmark landmark);

    List<Landmark> getAll();
}
