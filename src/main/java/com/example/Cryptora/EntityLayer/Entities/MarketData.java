package com.example.Cryptora.EntityLayer.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "market_data")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
