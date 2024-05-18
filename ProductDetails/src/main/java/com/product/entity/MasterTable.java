package com.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table

public class MasterTable {
	@Id
	 private String macAddress;
	    private int macId;
	    private String macName;
	    private String companyName;
		public String getMacAddress() {
			return macAddress;
		}
		public void setMacAddress(String macAddress) {
			this.macAddress = macAddress;
		}
		public int getMacId() {
			return macId;
		}
		public void setMacId(int macId) {
			this.macId = macId;
		}
		public String getMacName() {
			return macName;
		}
		public void setMacName(String macName) {
			this.macName = macName;
		}
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public MasterTable(String macAddress, int macId, String macName, String companyName) {
			super();
			this.macAddress = macAddress;
			this.macId = macId;
			this.macName = macName;
			this.companyName = companyName; 
		}
		public MasterTable() {
			
		}
		@Override
		public String toString() {
			return "MasterTable [macAddress=" + macAddress + ", macId=" + macId + ", macName=" + macName
					+ ", companyName=" + companyName + "]";
		}
	    
	    
}
