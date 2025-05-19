package com.example.Cryptora.EntityLayer.Entities;

import com.example.Cryptora.EntityLayer.Enums.TransactionType;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double quantity;
    private Double price;
    private Date timestamp;
    private TransactionType transactionType;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "crypto_id")
    private Crypto crypto;
}
