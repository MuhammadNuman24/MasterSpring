package com.example.Master.Controller;

import com.example.Master.Entity.Car;
import com.example.Master.Service.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/car")
public class carController {
    @Autowired
    private CarService carService;

    @GetMapping("/list")
    public ResponseEntity<List<Car>> getList(){
       List<Car> carEntity = carService.carList();
        return ResponseEntity.ok(carEntity);
    }

}
