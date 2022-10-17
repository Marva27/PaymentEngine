package com.paymentengine.www.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "productId", "productName", "productCost" })
@Generated("jsonschema2pojo")
public class ProtectionProduct {

	@JsonProperty("productId")
	private String productId;
	@JsonProperty("productName")
	private String productName;
	@JsonProperty("productCost")
	private Double productCost;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("productId")
	public String getProductId() {
		return productId;
	}

	@JsonProperty("productId")
	public void setProductId(String productId) {
		this.productId = productId;
	}

	@JsonProperty("productName")
	public String getProductName() {
		return productName;
	}

	@JsonProperty("productName")
	public void setProductName(String productName) {
		this.productName = productName;
	}

	@JsonProperty("productCost")
	public Double getProductCost() {
		return productCost;
	}

	@JsonProperty("productCost")
	public void setProductCost(Double productCost) {
		this.productCost = productCost;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
