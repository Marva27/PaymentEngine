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
@JsonPropertyOrder({ "accessoryId", "accessoryName", "accessoryCost" })
@Generated("jsonschema2pojo")
public class VehicleAddOn {

	@JsonProperty("accessoryId")
	private Integer accessoryId;
	@JsonProperty("accessoryName")
	private String accessoryName;
	@JsonProperty("accessoryCost")
	private Double accessoryCost;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("accessoryId")
	public Integer getAccessoryId() {
		return accessoryId;
	}

	@JsonProperty("accessoryId")
	public void setAccessoryId(Integer accessoryId) {
		this.accessoryId = accessoryId;
	}

	@JsonProperty("accessoryName")
	public String getAccessoryName() {
		return accessoryName;
	}

	@JsonProperty("accessoryName")
	public void setAccessoryName(String accessoryName) {
		this.accessoryName = accessoryName;
	}

	@JsonProperty("accessoryCost")
	public Double getAccessoryCost() {
		return accessoryCost;
	}

	@JsonProperty("accessoryCost")
	public void setAccessoryCost(Double accessoryCost) {
		this.accessoryCost = accessoryCost;
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
