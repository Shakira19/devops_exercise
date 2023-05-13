package com.devops.exercise.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Payload {
    private String message;
    private String to;
    private String from;
    private String timeToLifeSec;
}
