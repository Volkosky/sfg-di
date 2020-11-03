package com.volkosky.spring.sfgdi.controllers;

import com.volkosky.spring.sfgdi.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class SetterInjctedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Swiat - Setter";
    }
}
