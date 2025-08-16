package com.e_com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class VarificationCode {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	
	    private String otp;

	    private String email;

	    @OneToOne
	    private User user;

	    @OneToOne
	    private Seller seller;

		

		public VarificationCode() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

		public VarificationCode(Long id, String otp, String email, User user, Seller seller) {
			super();
			this.id = id;
			this.otp = otp;
			this.email = email;
			this.user = user;
			this.seller = seller;
		}



		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getOtp() {
			return otp;
		}

		public void setOtp(String otp) {
			this.otp = otp;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public Seller getSeller() {
			return seller;
		}

		public void setSeller(Seller seller) {
			this.seller = seller;
		}


}
