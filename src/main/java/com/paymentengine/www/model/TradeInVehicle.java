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
@JsonPropertyOrder({ "modelYear", "vehicleMake", "vehicleModel", "vin" })
@Generated("jsonschema2pojo")
public class TradeInVehicle {

	@JsonProperty("modelYear")
	private Integer modelYear;
	@JsonProperty("vehicleMake")
	private String vehicleMake;
	@JsonProperty("vehicleModel")
	private String vehicleModel;
	@JsonProperty("vin")
	private String vin;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("modelYear")
	public Integer getModelYear() {
		return modelYear;
	}

	@JsonProperty("modelYear")
	public void setModelYear(Integer modelYear) {
		this.modelYear = modelYear;
	}

	@JsonProperty("vehicleMake")
	public String getVehicleMake() {
		return vehicleMake;
	}

	@JsonProperty("vehicleMake")
	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	@JsonProperty("vehicleModel")
	public String getVehicleModel() {
		return vehicleModel;
	}

	@JsonProperty("vehicleModel")
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	@JsonProperty("vin")
	public String getVin() {
		return vin;
	}

	@JsonProperty("vin")
	public void setVin(String vin) {
		this.vin = vin;
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
