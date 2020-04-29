package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventsListener {

    @EventListener
    public void onAApplicationStartingEvent(ApplicationStartingEvent event) {
        System.out.println("---------ApplicationStartingEvent---------");
    }

    @EventListener
    public void onApplicationContextInitializedEvent(ApplicationContextInitializedEvent event) {
        System.out.println("---------ApplicationContextInitializedEvent---------");
    }

    @EventListener
    public void onContextRefreshedEvent(ContextRefreshedEvent event) {
        System.out.println("---------ContextRefreshedEvent---------");
    }

    @EventListener
    public void onApplicationStartedEvent(ApplicationStartedEvent ready) throws InterruptedException {
        System.out.println("---------ApplicationStartedEvent---------");
    }

    @EventListener
    public void onApplicationReadyEvent(ApplicationReadyEvent event) {
        System.out.println("---------ApplicationReadyEvent---------");
    }
}