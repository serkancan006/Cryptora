package com.example.Cryptora.EntityLayer.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "portfolios")
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "portfolio")
    private List<PortfolioAsset> portfolioAssets;
}
