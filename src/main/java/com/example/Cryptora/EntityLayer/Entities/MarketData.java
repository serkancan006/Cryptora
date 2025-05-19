package com.example.Cryptora.EntityLayer.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "market_data")
public class MarketData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double price;
    private Date timestamp;

    @ManyToOne
    @JoinColumn(name = "crypto_id")
    private Crypto crypto;
}
