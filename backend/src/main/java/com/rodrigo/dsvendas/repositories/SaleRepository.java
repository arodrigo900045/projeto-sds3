package com.rodrigo.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>
{

}
