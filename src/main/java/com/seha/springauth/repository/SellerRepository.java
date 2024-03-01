package com.seha.springauth.repository;

import com.seha.springauth.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    Optional<Seller> findByEmail(String email);
    Boolean existsByEmail(String email);
}
