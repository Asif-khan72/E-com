package com.E_com.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class CartItem {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	
	@ManyToOne
	@JsonIgnore  //?
	private Cart cart;
	@ManyToOne
    private Product product;
    
    private String size;
    
    private int quantity=1;
    
    private Integer mrpPrice;
    
    private Integer sellingPrice;
    
    private Long userId;
	
	

}
