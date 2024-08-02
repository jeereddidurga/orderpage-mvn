package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order")

public class order {
	 
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int orderid;
		private String orderitem;
		
		@Email
		
		private String cutomeremail;
		
		private long cutomerphone;

		public int getId() {
			// TODO Auto-generated method stub
			return 0;
		}

		public void setId(int id) {
			// TODO Auto-generated method stub
			
		}

		public Object getName() {
			// TODO Auto-generated method stub
			return null;
		}

		public void setEmail(String cutomeremail2) {
			// TODO Auto-generated method stub
			
		}

		public Object getorderitem() {
			// TODO Auto-generated method stub
			return null;
		}

		public Object getcutomerphone() {
			// TODO Auto-generated method stub
			return null;
		}

		public void getcutomerphone(Object getcutomerphone) {
			// TODO Auto-generated method stub
			
		}

		public void setorderitem(Object getorderitem) {
			// TODO Auto-generated method stub
			
		}

	}



