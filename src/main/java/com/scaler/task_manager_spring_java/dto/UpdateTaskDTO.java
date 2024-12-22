package com.scaler.task_manager_spring_java.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UpdateTaskDTO {
    String description;
    String deadline;
    Boolean completed;
}
