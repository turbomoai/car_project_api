package com.carproject.api.controller;

import com.carproject.api.model.Car;
import com.carproject.api.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("cars")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping
    public Iterable<Car> getCars() {
        return carService.getCars();
    }

    @GetMapping("/{id}")
    public Optional<Car> getCar(@PathVariable Long id) {
        return carService.getCar(id);
    }

    @PostMapping
    public ResponseEntity<Car> save(@RequestBody Car car) {
        Car newCar = carService.save(car);
        return new ResponseEntity<>(newCar, HttpStatus.CREATED);
    }
}
