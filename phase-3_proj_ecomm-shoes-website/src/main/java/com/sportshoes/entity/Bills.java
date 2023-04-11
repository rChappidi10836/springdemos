package com.sportshoes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bills")
public class Bills {
	
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name="bid")
	 int bid;

	 String date;
	 Long amount;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "uid")
	    private Users user;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "pid")
	    private Product product;

		public int getBid() {
			return bid;
		}

		public void setBid(int bid) {
			this.bid = bid;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public Long getAmount() {
			return amount;
		}

		public void setAmount(Long amount) {
			this.amount = amount;
		}

		public Users getUser() {
			return user;
		}

		public void setUser(Users user) {
			this.user = user;
		}

		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		@Override
		public String toString() {
			return "Bills [bid=" + bid + ", date=" + date + ", amount=" + amount + ", user=" + user + ", product="
					+ product + "]";
		}
	    
	
	 
	 
}
