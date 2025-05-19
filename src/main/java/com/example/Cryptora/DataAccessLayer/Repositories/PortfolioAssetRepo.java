package com.example.Cryptora.DataAccessLayer.Repositories;

import com.example.Cryptora.EntityLayer.Entities.PortfolioAsset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioAssetRepo extends JpaRepository<PortfolioAsset, Long> {
}
