package com.example.rest.controller;

import com.example.rest.dto.ParkRequest;
import com.example.rest.dto.ParkResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/carpark")
public class CarParkController {

    // Unary parkVehicle
    @PostMapping("/parkVehicle")
    public ParkResponse parkVehicle(@RequestBody ParkRequest request) {
        String vehicleNo = request.getVehicle().getVehicleNumber();
        String vehicleType = request.getVehicle().getVehicleType();

        String resultMsg = "The vehicle of number " + vehicleNo + " and type " + vehicleType + " is parked.";
        System.out.println(resultMsg);

        return new ParkResponse(resultMsg);
    }
}
