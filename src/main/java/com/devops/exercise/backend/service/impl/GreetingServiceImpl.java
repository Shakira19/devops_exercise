package com.devops.exercise.backend.service.impl;

import org.springframework.stereotype.Service;

import com.devops.exercise.backend.entities.Payload;
import com.devops.exercise.backend.entities.Response;
import com.devops.exercise.backend.service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService{

    @Override
    public Response greeting(Payload payload) {
        return Response.builder()
            .message(String.format("Hello %s your message will be send", payload.getTo()))
            .build();
    }
    
}
