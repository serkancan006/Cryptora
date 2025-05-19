package com.example.Cryptora.EntityLayer.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cryptos")
public class Crypto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String symbol;
    private String name;

    @OneToMany(mappedBy = "crypto")
    private List<MarketData> marketDatas;

    @OneToMany(mappedBy = "crypto")
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "crypto")
    private List<PortfolioAsset> portfolioAssets;
}
