package com.rodrigo.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>
{

}
