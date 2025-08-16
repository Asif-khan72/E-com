package com.e_com.model;

import java.util.HashSet;
import java.util.Set;

import com.e_com.domain.USER_ROLE;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	private String password;
	private String email;
	private String FullName;
	private USER_ROLE role=USER_ROLE.ROLE_customer;
	@OneToMany
	private Set<Address> address=new HashSet<>();
	@ManyToMany
	@JsonIgnore
	private Set<Coupon> usedCoupons=new HashSet<>();
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long id, String password, String email, String fullName, USER_ROLE role, Set<Address> address,
			Set<Coupon> usedCoupons) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
		FullName = fullName;
		this.role = role;
		this.address = address;
		this.usedCoupons = usedCoupons;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public USER_ROLE getRole() {
		return role;
	}
	public void setRole(USER_ROLE role) {
		this.role = role;
	}
	public Set<Address> getAddress() {
		return address;
	}
	
	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	
	public Set<Coupon> getUsedCoupons() {
		return usedCoupons;
	}
	public void setUsedCoupons(Set<Coupon> usedCoupons) {
		this.usedCoupons = usedCoupons;
	}
	
	
	

}
