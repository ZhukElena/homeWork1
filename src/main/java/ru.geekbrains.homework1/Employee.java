package ru.geekbrains.homework1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private Double salary;
    private Integer age;
}
