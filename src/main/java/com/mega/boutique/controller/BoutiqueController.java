package com.mega.boutique.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mega.boutique.entity.Boutique;
import com.mega.boutique.service.BoutiqueService;


@CrossOrigin
@RestController
public class BoutiqueController {
	@Autowired
	private BoutiqueService btService;
	@PostMapping("/order")
	public String saveDetails(@RequestBody Boutique b)
	{
		btService.saveDetails(b);
		return "data added";
	}
	
	@GetMapping("/getDress")
	public List<Boutique> getAllDetails()
	{
		return btService.getAllDetails();
	}
	
	@PutMapping("/updateOrders")	
	public String updatedetails(@RequestBody Boutique b)
	{
		btService.updateOrder(b);
		return "order Updated";
	}
	
	   @PutMapping("/update/{id}")
	   public Boutique updateById(@PathVariable int id, @RequestBody Boutique b) {
	       return btService.updateById(b,id);
	   }
	@DeleteMapping("/del/{id}")
	public String deleteOrder(@PathVariable("id") int id){
			btService.deleteOrderById(id);
			return "canceled";
		}
	
	
}
