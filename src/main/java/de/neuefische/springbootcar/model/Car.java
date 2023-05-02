package de.neuefische.springbootcar.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class Car {

    private String brand;
    private boolean inspectionCertificate;
    private int numberOfTires;
}

