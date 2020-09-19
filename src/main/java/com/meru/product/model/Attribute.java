package com.meru.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ATTRIBUTE")
public class Attribute {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ATTRIBUTE_ID")
	private long attributeId;
	
	@Column(name = "ATTRIBUTE_NAME")
	private String attributeName;
	
	@Column(name = "ATTRIBUTE_DES")
	private String attributeDescription;
	
	public long getAttributeId() {
		return attributeId;
	}
	public void setAttributeId(long attributeId) {
		this.attributeId = attributeId;
	}
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	public String getAttributeDescription() {
		return attributeDescription;
	}
	public void setAttributeDescription(String attributeDescription) {
		this.attributeDescription = attributeDescription;
	}
}
