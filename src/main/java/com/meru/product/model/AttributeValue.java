package com.meru.product.model;

import javax.persistence.CascadeType;
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
@Table(name = "ATTRIBUTE_VALUE")
public class AttributeValue {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ATTRIBUTE_VALUE_ID")
	private long attributeValueId;
	
	@Column(name = "ATTRIBUTE_ID")
	private long attributeId;
	
	@Column(name = "ATTRIBUTE_VALUE_NAME")
	private String attributeValueName;
	
	@Column(name = "ATTRIBUTE_VALUE_DES")
	private String attributeValueDescription;
	
	/*@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "PRODUCT_ID")
	private Product product;*/
	
	public long getAttributeValueId() {
		return attributeValueId;
	}
	public void setAttributeValueId(long attributeValueId) {
		this.attributeValueId = attributeValueId;
	}
	public long getAttributeId() {
		return attributeId;
	}
	public void setAttributeId(long attributeId) {
		this.attributeId = attributeId;
	}
	public String getAttributeValueName() {
		return attributeValueName;
	}
	public void setAttributeValueName(String attributeValueName) {
		this.attributeValueName = attributeValueName;
	}
	public String getAttributeValueDescription() {
		return attributeValueDescription;
	}
	public void setAttributeValueDescription(String attributeValueDescription) {
		this.attributeValueDescription = attributeValueDescription;
	}
	/*public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}*/
	
}
