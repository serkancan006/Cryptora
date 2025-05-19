package com.example.Cryptora.DataAccessLayer.Repositories;

import com.example.Cryptora.EntityLayer.Entities.MarketData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketDataRepo extends JpaRepository<MarketData, Long> {
}
