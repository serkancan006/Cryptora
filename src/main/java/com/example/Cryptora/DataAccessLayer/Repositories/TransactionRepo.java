package com.example.Cryptora.DataAccessLayer.Repositories;

import com.example.Cryptora.EntityLayer.Entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Long> {
}
