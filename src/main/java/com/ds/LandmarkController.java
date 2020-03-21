package com.ds;

import com.ds.entity.Landmark;
import com.ds.service.LandmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/landmark")
public class LandmarkController {

    @Autowired
    private LandmarkService landmarkService;

    @GetMapping
    public List<Landmark> getAll() {
        return landmarkService.getAll();
    }

    @PostMapping
    public Landmark save(@RequestBody Landmark landmark) {
        return landmarkService.save(landmark);
    }


}
