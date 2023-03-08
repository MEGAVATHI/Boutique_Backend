package com.mega.boutique.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Boutique")
public class Boutique {
		@Id
		@Column(name="id")
		private int id;
		
		@Column(name="name")
		private String name;
		
		@Column(name="material")
		private String material;
		
		@Column(name="nPieces")
		private int nPieces;
		
		@Column(name="color")
		private String color;
		
		@Column(name="avail")
		private String avail;
		
		@Column(name="price")
		private int price;
		
		
		
		Boutique() {}

		Boutique(int id,String name,String material,int npieces,String color,String avail,int price){
			super();
			this.id=id;
			this.name=name;
			this.material=material;
			this.nPieces=npieces;
			this.color=color;
			this.avail=avail;
			this.price=price;
			
		}

//		GETTERS SETTERS
		
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

		public int getnPieces() {
			return nPieces;
		}

		public void setnPieces(int nPieces) {
			this.nPieces = nPieces;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String getAvail() {
			return avail;
		}

		public void setAvail(String avail) {
			this.avail = avail;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		
		
		

		
		

}
