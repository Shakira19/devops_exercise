package com.devops.exercise.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devops.exercise.backend.entities.Payload;
import com.devops.exercise.backend.entities.Response;
import com.devops.exercise.backend.service.GreetingService;

@RestController
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    @PostMapping(value = "/DevOps")
    public Response greeting(@RequestBody Payload payload){
        return greetingService.greeting(payload);
    }
}
