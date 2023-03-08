package com.mega.boutique.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mega.boutique.entity.Boutique;
import com.mega.boutique.repository.BoutiqueRepository;

@Service
public class BoutiqueService {
	@Autowired
	   private BoutiqueRepository btRepo;
	   
	   
	   public Boutique  saveDetails(Boutique b) {
		   return btRepo.save(b);
	   }
	  
	   public List<Boutique>getAllDetails(){
		   return btRepo.findAll();
	   }
	   
	   public void updateOrder(Boutique b) {
		   btRepo.saveAndFlush(b);
	   } 

	   public void deleteOrderById(int id) {
		 btRepo.deleteById(id);
		
	}
	   public Boutique updateById(Boutique b,int id) {
		   b.setId(id);
		   return btRepo.saveAndFlush(b);
	   }
}
