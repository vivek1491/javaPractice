package org.interview.dao;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "users")
@Data

@SequenceGenerator(
        name = "user_seq",
        sequenceName = "user_sequence",
        initialValue = 1,
        allocationSize = 1)

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String role;
}
