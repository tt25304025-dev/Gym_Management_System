package edu.TT.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class MemberEntity {
    @Id
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
