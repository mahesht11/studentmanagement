package com.student.management.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;
    @Column(name="FIRSTNAME", nullable = false)
    private String firstName;
    @Column(name="LASTNAME")
    private String lastName;
    @Column(name="EMAIL")
    private String email;

}
