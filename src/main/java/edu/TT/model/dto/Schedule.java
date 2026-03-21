package edu.TT.model.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Schedule {
    private String scheduleDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private String timeDuration;
}
