package com.paymentengine.www.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "modelYear", "vehicleMake", "vehicleModel", "carLineCode", "modelCode", "vehicleSellingPrice",
		"vehicleMsrp", "dealerInstalledAccessoriesTotal", "dealerInstalledAccessories", "totalVehicleSellingPrice" })
@Generated("jsonschema2pojo")
public class Vehicle {

	@JsonProperty("modelYear")
	private Integer modelYear;
	@JsonProperty("vehicleMake")
	private String vehicleMake;
	@JsonProperty("vehicleModel")
	private String vehicleModel;
	@JsonProperty("carLineCode")
	private String carLineCode;
	@JsonProperty("modelCode")
	private String modelCode;
	@JsonProperty("vehicleSellingPrice")
	private Double vehicleSellingPrice;
	@JsonProperty("vehicleMsrp")
	private Double vehicleMsrp;
	@JsonProperty("dealerInstalledAccessoriesTotal")
	private Double dealerInstalledAccessoriesTotal;
	@JsonProperty("dealerInstalledAccessories")
	private List<DealerInstalledAccessory> dealerInstalledAccessories = null;
	@JsonProperty("totalVehicleSellingPrice")
	private Double totalVehicleSellingPrice;
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

	@JsonProperty("carLineCode")
	public String getCarLineCode() {
		return carLineCode;
	}

	@JsonProperty("carLineCode")
	public void setCarLineCode(String carLineCode) {
		this.carLineCode = carLineCode;
	}

	@JsonProperty("modelCode")
	public String getModelCode() {
		return modelCode;
	}

	@JsonProperty("modelCode")
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	@JsonProperty("vehicleSellingPrice")
	public Double getVehicleSellingPrice() {
		return vehicleSellingPrice;
	}

	@JsonProperty("vehicleSellingPrice")
	public void setVehicleSellingPrice(Double vehicleSellingPrice) {
		this.vehicleSellingPrice = vehicleSellingPrice;
	}

	@JsonProperty("vehicleMsrp")
	public Double getVehicleMsrp() {
		return vehicleMsrp;
	}

	@JsonProperty("vehicleMsrp")
	public void setVehicleMsrp(Double vehicleMsrp) {
		this.vehicleMsrp = vehicleMsrp;
	}

	@JsonProperty("dealerInstalledAccessoriesTotal")
	public Double getDealerInstalledAccessoriesTotal() {
		return dealerInstalledAccessoriesTotal;
	}

	@JsonProperty("dealerInstalledAccessoriesTotal")
	public void setDealerInstalledAccessoriesTotal(Double dealerInstalledAccessoriesTotal) {
		this.dealerInstalledAccessoriesTotal = dealerInstalledAccessoriesTotal;
	}

	@JsonProperty("dealerInstalledAccessories")
	public List<DealerInstalledAccessory> getDealerInstalledAccessories() {
		return dealerInstalledAccessories;
	}

	@JsonProperty("dealerInstalledAccessories")
	public void setDealerInstalledAccessories(List<DealerInstalledAccessory> dealerInstalledAccessories) {
		this.dealerInstalledAccessories = dealerInstalledAccessories;
	}

	@JsonProperty("totalVehicleSellingPrice")
	public Double getTotalVehicleSellingPrice() {
		return totalVehicleSellingPrice;
	}

	@JsonProperty("totalVehicleSellingPrice")
	public void setTotalVehicleSellingPrice(Double totalVehicleSellingPrice) {
		this.totalVehicleSellingPrice = totalVehicleSellingPrice;
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
