package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class SlowService {
    public void doSomeThingSlowly() throws InterruptedException {
        for (int i = 0; i < 30; i++) {
            System.out.println("Doing stuff");
            Thread.sleep(1000);
        }
    }
}
