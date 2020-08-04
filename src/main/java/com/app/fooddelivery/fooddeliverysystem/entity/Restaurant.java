package com.app.fooddelivery.fooddeliverysystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restaurants")
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="restaurant_id")
	private int r_id;
	
	@Column(name="restaurant_name")
	private String rest_name;
	
	@Column(name="rating")
	private int rest_rating;

	public Restaurant() {
		
	}

	public Restaurant(int r_id, String rest_name, int rest_rating) {
		this.r_id = r_id;
		this.rest_name = rest_name;
		this.rest_rating = rest_rating;
	}

	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	public String getRest_name() {
		return rest_name;
	}

	public void setRest_name(String rest_name) {
		this.rest_name = rest_name;
	}

	public int getRest_rating() {
		return rest_rating;
	}

	public void setRest_rating(int rest_rating) {
		this.rest_rating = rest_rating;
	}

	@Override
	public String toString() {
		return "Restaurant [r_id=" + r_id + ", rest_name=" + rest_name + ", rest_rating=" + rest_rating + "]";
	}
	
	
}
