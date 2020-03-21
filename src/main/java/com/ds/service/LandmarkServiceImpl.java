package com.ds.service;

import com.ds.dao.LandmarkRepository;
import com.ds.entity.Landmark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LandmarkServiceImpl implements LandmarkService {

    @Autowired
    private LandmarkRepository landmarkRepository;

    @Override
    public Landmark save(Landmark landmark) {
        return landmarkRepository.save(landmark);
    }

    @Override
    public List<Landmark> getAll() {
        return landmarkRepository.findAll();
    }
}
