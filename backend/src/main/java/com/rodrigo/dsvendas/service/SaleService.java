package com.rodrigo.dsvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rodrigo.dsvendas.dto.SaleDTO;
import com.rodrigo.dsvendas.dto.SaleSuccessDTO;
import com.rodrigo.dsvendas.dto.SaleSumDTO;
import com.rodrigo.dsvendas.entities.Sale;
import com.rodrigo.dsvendas.repositories.SaleRepository;
import com.rodrigo.dsvendas.repositories.SellerRepository;

@Service
public class SaleService 
{  
   @Autowired	
   private SaleRepository repository;
   
   @Autowired
   private SellerRepository sellerRepository;
   
   @Transactional(readOnly = true)
   public Page<SaleDTO> findAll(Pageable pageable)
   {
	   sellerRepository.findAll();
	   Page<Sale> result = repository.findAll(pageable);
	   return result.map(x -> new SaleDTO(x));
   }
   
   @Transactional(readOnly = true)
   public List<SaleSumDTO> amountGroupedBySeller()
   {
	   return repository.amountGroupedBySeller();
   }
   @Transactional(readOnly = true)
   public List<SaleSuccessDTO> successGroupedBySeller()
   {
	   return repository.successGroupedBySeller();
   }
}
