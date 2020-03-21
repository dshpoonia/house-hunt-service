package com.ds.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pricing {

    private double pricePerSqft;
    private double floorRisingCharges;
    private double premiumCharges;
    private double quotedPrice;
    private double negotiatedPrice;
    private double maintenanceChargesPerSft;

}
