package com.example.demo.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.order;
import com.example.demo.services.orderservices;


@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:4200/")
public class ordercontrollers {
	@Autowired
	orderservices ser;
	@PostMapping("/insertion")
	
	public order inseration(@RequestBody  order s) {
		return ser.insertion(s);
		
	}
	@PostMapping("/insertall")
	public Iterable<order> insertAll(@RequestBody List<order> std) {
		return ser.insertAll(std);
	}
	@GetMapping("/getall")
	public List<order> getall(){
		return ser.getall();
	}
	@GetMapping("/getbyid/{id}")
	public Optional<order> getbyid(@PathVariable int id) {
		return ser.getbyid(id);
	}
	@GetMapping("/findbyemail/{email}")
	public order findByEmail(@PathVariable String email) {
		return ser.getByEmail(email);
	}
	@DeleteMapping("/delatebyid/{id}")
	public String delatebyid( @PathVariable int id) {
		return ser.delatebyid(id);
	}
	@PutMapping("/update")
	public order updateALL(@RequestBody order up) {
		return ser.updateAll(up);
	}


}
