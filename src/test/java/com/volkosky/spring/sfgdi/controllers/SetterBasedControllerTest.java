package com.volkosky.spring.sfgdi.controllers;

import com.volkosky.spring.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterBasedControllerTest {

    SetterBasedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterBasedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}