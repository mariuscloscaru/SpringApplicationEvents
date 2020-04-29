package com.example.demo;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class DataController {

    @GetMapping("/data")
    public DataDTO getData() {
        return DataDTO.builder().someData(UUID.randomUUID().toString()).build();
    }

    @Data
    @Builder
    public static class DataDTO {
        private String someData;
    }
}
