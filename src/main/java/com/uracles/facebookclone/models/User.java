package com.uracles.facebookclone.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class User {
    private String firstName;
    private String lastName;
    private int id;
    private String Date_of_birth;
    private String Gender;
    private String PhoneNumber;
    private String email;
    private String country;
    private String Date_of_registraton;
}
