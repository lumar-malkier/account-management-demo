package com.example.accountmanagementdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "activation_token")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivationToken {
    @Id
    private String token;
    private LocalDateTime expiration;

    @OneToOne
    @JoinColumn(name = "email")
    private Account account;
}
