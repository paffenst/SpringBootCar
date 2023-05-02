package de.neuefische.springbootcar.repo;

import de.neuefische.springbootcar.model.Car;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CarRepository {
    private Map<String, Car> carList = new HashMap<>();

    public Map<String, Car> addCar(Car car){
        //using UUID.randomUUID().toString for setting a key in request body giving
        String id = UUID.randomUUID().toString();
        carList.put(id,car);
        return Map.of(id,car);
    }

    public Map<String, Car> getCars() {
        return carList;
    }
}
