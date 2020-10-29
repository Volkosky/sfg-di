package com.volkosky.spring.sfgdi.controllers;

import com.volkosky.spring.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
