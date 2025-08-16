package com.e_com.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
@Entity
public class Transaction {
      
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	  @ManyToOne
	    private User customer;

	    @OneToOne
	    private Order order;

	    @ManyToOne
	    private Seller seller;

	    private LocalDateTime date= LocalDateTime.now();

		public Transaction() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Transaction(Long id, User customer, Order order, Seller seller, LocalDateTime date) {
			super();
			this.id = id;
			this.customer = customer;
			this.order = order;
			this.seller = seller;
			this.date = date;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public User getCustomer() {
			return customer;
		}

		public void setCustomer(User customer) {
			this.customer = customer;
		}

		public Order getOrder() {
			return order;
		}

		public void setOrder(Order order) {
			this.order = order;
		}

		public Seller getSeller() {
			return seller;
		}

		public void setSeller(Seller seller) {
			this.seller = seller;
		}

		public LocalDateTime getDate() {
			return date;
		}

		public void setDate(LocalDateTime date) {
			this.date = date;
		}

}
