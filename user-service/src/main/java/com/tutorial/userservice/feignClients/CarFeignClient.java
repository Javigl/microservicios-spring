package com.tutorial.userservice.feignClients;

import com.tutorial.userservice.model.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "car-service", path = "/car")
public interface CarFeignClient {
    @GetMapping("/byuser/{userId}")
    List<Car> getCars(@PathVariable("userId") int userId);
    @PostMapping
    Car save(@RequestBody Car car);
}
