package com.ds.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnitInMind {

    private String unitNumber;
    private int floorNumber;
    private String otherNotes;

}
