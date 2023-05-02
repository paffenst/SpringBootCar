package de.neuefische.springbootcar.repo;

import de.neuefische.springbootcar.model.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@AllArgsConstructor
@Repository
public class CarRepository {
    private Map<String, Car> carList = new HashMap<>();

    public Map<String, Car> addCar(Car car) {
        //using UUID.randomUUID().toString for setting a key in request body giving
        String id = UUID.randomUUID().toString();
        carList.put(id, car);
        return Map.of(id, car);
    }

    public Map<String, Car> getCars() {
        return carList;
    }

    public void deleteCar(@PathVariable String id) {
        carList.remove(id);
    }

    public boolean containsKey(String id) {
        return carList.containsKey(id);
    }

    public void updateCar(String id, Car car) {
        carList.replace(id, car);
    }
}