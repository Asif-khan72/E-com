package com.e_com.model;

import com.e_com.domain.HomeCategorySection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HomeCategory {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String image;
    private String categoryId;
    private HomeCategorySection section;
	public HomeCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HomeCategory(Long id, String name, String image, String categoryId, HomeCategorySection section) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.categoryId = categoryId;
		this.section = section;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public HomeCategorySection getSection() {
		return section;
	}
	public void setSection(HomeCategorySection section) {
		this.section = section;
	}


}
