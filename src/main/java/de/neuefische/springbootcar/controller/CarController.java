package de.neuefische.springbootcar.controller;

import de.neuefische.springbootcar.model.Car;
import de.neuefische.springbootcar.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class CarController {
    private CarService carService;

    @PostMapping("car/new")
    public Map<String, Car> newCar(@RequestBody Car car) {
        return carService.addCar(car);

    }

    @GetMapping("car")
    public Map<String, Car> getCar() {
        return carService.getCars();
    }

    @DeleteMapping("/delete/car/{id}")
    public void deleteCar(@PathVariable String id) {
        carService.deleteCar(id);
    }

    @PutMapping("/update/car/{id}")
    public void updateCar(@PathVariable String id, @RequestBody Car car) {
        carService.updateCar(id, car);
    }

}