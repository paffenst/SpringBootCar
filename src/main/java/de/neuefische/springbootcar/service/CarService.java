package de.neuefische.springbootcar.service;

import de.neuefische.springbootcar.CarNotFoundException;
import de.neuefische.springbootcar.model.Car;
import de.neuefische.springbootcar.repo.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@AllArgsConstructor
@Service

public class CarService {
    private CarRepository carRepository;

    public Map<String, Car> addCar(Car car) {
        return carRepository.addCar(car);
    }

    public Map<String, Car> getCars() {
        return carRepository.getCars();
    }

    public void deleteCar(String id) {
        if (!carRepository.containsKey(id)) {
            throw new CarNotFoundException(id);
        } else {
            carRepository.deleteCar(id);
        }
    }

    public void updateCar(String id, Car car) {
        if (!carRepository.containsKey(id)) {
            throw new CarNotFoundException(id);
        } else {
            carRepository.updateCar(id, car);
        }
    }

}
