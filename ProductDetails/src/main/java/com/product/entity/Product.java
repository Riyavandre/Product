package com.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer prodId;
    private String prodName;
    private String prodDescription;
    private double prodPrize;
    private Integer prodLocationId;
    private String macAddress;
    private String companyName;
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdDescription() {
		return prodDescription;
	}
	public void setProdDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}
	public double getProdPrize() {
		return prodPrize;
	}
	public void setProdPrize(double prodPrize) {
		this.prodPrize = prodPrize;
	}
	public Integer getProdLocationId() {
		return prodLocationId;
	}
	public void setProdLocationId(Integer prodLocationId) {
		this.prodLocationId = prodLocationId;
	}
	public String getMacAddress() {
		return macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Product(Integer prodId, String prodName, String prodDescription, double prodPrize, Integer prodLocationId,
			String macAddress, String companyName) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodDescription = prodDescription;
		this.prodPrize = prodPrize;
		this.prodLocationId = prodLocationId;
		this.macAddress = macAddress;
		this.companyName = companyName;
	}
	public Product() {
		
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodDescription=" + prodDescription
				+ ", prodPrize=" + prodPrize + ", prodLocationId=" + prodLocationId + ", macAddress=" + macAddress
				+ ", companyName=" + companyName + "]";
	}
    
    
    
}
