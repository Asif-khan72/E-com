package com.e_com.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Coupon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String code;
	
	private double discountPercentage;
	private LocalDate validityStarDate;
	private LocalDate validityEndDate;
	private double minimumOrderValue;
	private boolean isActive=true;
	
	@ManyToMany(mappedBy="usedCoupons")    //?
	private Set<User> usedByUser=new HashSet<>();

	public Coupon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coupon(Long id, String code, double discountPercentage, LocalDate validityStarDate,
			LocalDate validityEndDate, double minimumOrderValue, boolean isActive, Set<User> usedByUser) {
		super();
		this.id = id;
		this.code = code;
		this.discountPercentage = discountPercentage;
		this.validityStarDate = validityStarDate;
		this.validityEndDate = validityEndDate;
		this.minimumOrderValue = minimumOrderValue;
		this.isActive = isActive;
		this.usedByUser = usedByUser;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public LocalDate getValidityStarDate() {
		return validityStarDate;
	}

	public void setValidityStarDate(LocalDate validityStarDate) {
		this.validityStarDate = validityStarDate;
	}

	public LocalDate getValidityEndDate() {
		return validityEndDate;
	}

	public void setValidityEndDate(LocalDate validityEndDate) {
		this.validityEndDate = validityEndDate;
	}

	public double getMinimumOrderValue() {
		return minimumOrderValue;
	}

	public void setMinimumOrderValue(double minimumOrderValue) {
		this.minimumOrderValue = minimumOrderValue;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Set<User> getUsedByUser() {
		return usedByUser;
	}

	public void setUsedByUser(Set<User> usedByUser) {
		this.usedByUser = usedByUser;
	}
	
	
	

}
