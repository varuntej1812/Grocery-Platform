package com.example.userservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    private String uid;
    private String name;
    private String email;
    private String role = "CONSUMER"; // default role
}
