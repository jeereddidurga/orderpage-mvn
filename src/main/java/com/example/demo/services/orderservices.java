package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.order;

import com.example.demo.repository.orderrepository;


public class orderservices {
	@Autowired
	orderrepository repo;
	public order insertion(order s) {
		return repo.save(s);
	}
	public Iterable<order> insertAll(List<order> std) {
		return repo.saveAll(std);
	}
	public List<order> getall(){
		return (List<order>) repo.findAll();
				
	}
	public Optional<order> getbyid(int id) {
		return repo.findById(id);
	}
	public order getByEmail(String email) {
		return repo.findByEmail(email);
	}
	public String delatebyid(int id) {
		 repo.deleteById(id);
		 return "sucessfully delated" + id;
	}

	public order updateAll(order up) {
		int orderid = up.getId();
		order dent = repo.findById(orderid).get();
		dent.setId(up.getId());

		dent.setorderitem(up.getorderitem());
		dent.setCutomeremail(up.getCutomeremail());
		dent.getcutomerphone(up.getcutomerphone());
		return repo.save(up);
		
	}


}
