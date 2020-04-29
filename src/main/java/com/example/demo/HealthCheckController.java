package com.example.demo;

import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class HealthCheckController {
    @Autowired
    SlowService slowService;

    @GetMapping("/")
    public HealthCheckDTO getHealthCheck() {
        return HealthCheckDTO.builder().status("OK").build();
    }

    @PostConstruct
    public void runAfter() throws InterruptedException {
        slowService.doSomeThingSlowly();
    }

    @Data
    @Builder
    public static class HealthCheckDTO {
        private String status;
    }
}
