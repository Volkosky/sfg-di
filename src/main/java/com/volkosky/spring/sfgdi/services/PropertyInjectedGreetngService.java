package com.volkosky.spring.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetngService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Swiat - Property";
    }
}
