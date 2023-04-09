package com.example.test.entity;

import java.sql.Blob;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {
 
    @Id
    private int id;
     
    @Column(name="pic")
    private Blob blob;
 
    // getters and setters
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Blob getBlob() {
		return blob;
	}

	public void setBlob(Blob blob) {
		this.blob = blob;
	}

	
	}
    

