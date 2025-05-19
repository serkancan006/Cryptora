package com.example.Cryptora.DataAccessLayer.Repositories;

import com.example.Cryptora.EntityLayer.Entities.Crypto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CryptoRepo extends JpaRepository<Crypto, Long> {
}
