package com.example.Cryptora.DataAccessLayer.Repositories;

import com.example.Cryptora.EntityLayer.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
}
