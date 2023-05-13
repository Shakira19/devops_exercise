package com.devops.exercise.backend.service;

import com.devops.exercise.backend.entities.Payload;
import com.devops.exercise.backend.entities.Response;

public interface GreetingService {
    public Response greeting(Payload payload);
}
