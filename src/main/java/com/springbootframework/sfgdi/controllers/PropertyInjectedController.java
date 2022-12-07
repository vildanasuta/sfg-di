package com.springbootframework.sfgdi.controllers;

import com.springbootframework.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.myGreeting();
    }
}
