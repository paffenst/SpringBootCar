package de.neuefische.springbootcar.service;

import de.neuefische.springbootcar.model.Car;
import de.neuefische.springbootcar.repo.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@AllArgsConstructor
@Service

public class CarService {
    private CarRepository carRepository;

    public Map<String,Car> addCar(Car car){
        return carRepository.addCar(car);
    }

    public Map<String, Car> getCars() {
        return carRepository.getCars();
    }

}
