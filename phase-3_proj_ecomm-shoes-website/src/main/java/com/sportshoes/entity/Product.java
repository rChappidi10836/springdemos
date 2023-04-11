package com.sportshoes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="pid")
    private int id;
     
    private String name;
    
    private String image;
    
    private String category;
    
    private int price;
    
    private String status;
    
    public Product() {
    }
    
    
    
	 public Product(int id, String name, String image, String category, int price, String status) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.category = category;
		this.price = price;
		this.status = status;
	}



	public Product(String name, String image, String category, int price, String status) {
		this.name = name;
		this.image = image;
		this.category = category;
		this.price = price;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", image=" + image + ", category=" + category + ", price="
				+ price + "]";
	}
    
    
	
}
    

