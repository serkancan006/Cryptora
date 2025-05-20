package com.example.Cryptora.EntityLayer.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "portfolio-assets")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PortfolioAsset {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double quantity;
    private Double price;
    private Date createdAt;
    private Date updatedAt;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "crypto_id")
    private Crypto crypto;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
