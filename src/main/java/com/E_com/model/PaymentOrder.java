package com.E_com.model;

import java.util.HashSet;
import java.util.Set;

import com.E_com.domain.PaymentMethod;
import com.E_com.domain.PaymentOrderStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class PaymentOrder {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	 private Long id;
     
     private Long amount;

     private PaymentOrderStatus status = PaymentOrderStatus.PENDING;

     private PaymentMethod paymentMethod;

     private String paymentLinkId;


     @ManyToOne
     private User user;

     @OneToMany
     private Set<Order> orders = new HashSet<>();

 	public PaymentOrder() {
 		super();
 		// TODO Auto-generated constructor stub
 	}

 	public PaymentOrder(Long id, Long amount, PaymentOrderStatus status, PaymentMethod paymentMethod,
 			String paymentLinkId, User user, Set<Order> orders) {
 		super();
 		this.id = id;
 		this.amount = amount;
 		this.status = status;
 		this.paymentMethod = paymentMethod;
 		this.paymentLinkId = paymentLinkId;
 		this.user = user;
 		this.orders = orders;
 	}

 	public Long getId() {
 		return id;
 	}

 	public void setId(Long id) {
 		this.id = id;
 	}

 	public Long getAmount() {
 		return amount;
 	}

 	public void setAmount(Long amount) {
 		this.amount = amount;
 	}

 	public PaymentOrderStatus getStatus() {
 		return status;
 	}

 	public void setStatus(PaymentOrderStatus status) {
 		this.status = status;
 	}

 	public PaymentMethod getPaymentMethod() {
 		return paymentMethod;
 	}

 	public void setPaymentMethod(PaymentMethod paymentMethod) {
 		this.paymentMethod = paymentMethod;
 	}

 	public String getPaymentLinkId() {
 		return paymentLinkId;
 	}

 	public void setPaymentLinkId(String paymentLinkId) {
 		this.paymentLinkId = paymentLinkId;
 	}

 	public User getUser() {
 		return user;
 	}

 	public void setUser(User user) {
 		this.user = user;
 	}

 	public Set<Order> getOrders() {
 		return orders;
 	}

 	public void setOrders(Set<Order> orders) {
 		this.orders = orders;
 	}

	
}
