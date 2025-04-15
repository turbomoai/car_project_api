package com.carproject.api.service;

import com.carproject.api.model.Car;
import com.carproject.api.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public Iterable<Car> getCars() {
        return carRepository.findAll();
    }

    public Optional<Car> getCar(final Long id) {
        return carRepository.findById(id);
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }
}
