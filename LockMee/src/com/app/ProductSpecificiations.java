package com.app;

public class ProductSpecificiations {
	
	private int prodId;
	private String prodName;
	private String dateofDelivery;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = Integer.parseInt(prodId);
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getDateofDelivery() {
		return dateofDelivery;
	}
	public void setDateofDelivery(String dateofDelivery) {
		this.dateofDelivery = dateofDelivery;
	}

	public ProductSpecificiations(String prodId, String prodName,
			String dateofDelivery) {
		super();
		this.prodId = Integer.parseInt(prodId);
		this.prodName = prodName;
		this.dateofDelivery = dateofDelivery;
		
	}
	@Override
	public String toString() {
		return prodId + prodName + dateofDelivery;
	}
	
	

}
