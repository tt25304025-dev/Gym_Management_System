package edu.TT.model.dto;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {
    private String memberId;
    private String name;
    private String email;
    private String address;
    private LocalDate date;
    private Double BMI;
    private String phoneNumber;
    private  double registrationfee;
    private double subscription;
}
