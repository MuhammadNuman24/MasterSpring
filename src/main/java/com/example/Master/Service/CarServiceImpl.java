package com.example.Master.Service;

import com.example.Master.Entity.Car;
import com.example.Master.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarRepository carRepo;

    @Override
    public List<Car> carList() {
        return carRepo.findAll();
    }

}
