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
@JsonPropertyOrder({ "dealerId", "customer", "vehicle", "vehicleAddOnsTotal", "vehicleAddOns",
		"protectionProductsTotal", "protectionProducts", "terms", "cashDown", "tradeIns", "firstPaymentDueOn" })
@Generated("jsonschema2pojo")
public class FinanceQuoteRequest__1 {

	@JsonProperty("dealerId")
	private Integer dealerId;
	@JsonProperty("customer")
	private Customer customer;
	@JsonProperty("vehicle")
	private Vehicle vehicle;
	@JsonProperty("vehicleAddOnsTotal")
	private Double vehicleAddOnsTotal;
	@JsonProperty("vehicleAddOns")
	private List<VehicleAddOn> vehicleAddOns = null;
	@JsonProperty("protectionProductsTotal")
	private Double protectionProductsTotal;
	@JsonProperty("protectionProducts")
	private List<ProtectionProduct> protectionProducts = null;
	@JsonProperty("terms")
	private List<Integer> terms = null;
	@JsonProperty("cashDown")
	private Integer cashDown;
	@JsonProperty("tradeIns")
	private List<TradeIn> tradeIns = null;
	@JsonProperty("firstPaymentDueOn")
	private String firstPaymentDueOn;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("dealerId")
	public Integer getDealerId() {
		return dealerId;
	}

	@JsonProperty("dealerId")
	public void setDealerId(Integer dealerId) {
		this.dealerId = dealerId;
	}

	@JsonProperty("customer")
	public Customer getCustomer() {
		return customer;
	}

	@JsonProperty("customer")
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@JsonProperty("vehicle")
	public Vehicle getVehicle() {
		return vehicle;
	}

	@JsonProperty("vehicle")
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@JsonProperty("vehicleAddOnsTotal")
	public Double getVehicleAddOnsTotal() {
		return vehicleAddOnsTotal;
	}

	@JsonProperty("vehicleAddOnsTotal")
	public void setVehicleAddOnsTotal(Double vehicleAddOnsTotal) {
		this.vehicleAddOnsTotal = vehicleAddOnsTotal;
	}

	@JsonProperty("vehicleAddOns")
	public List<VehicleAddOn> getVehicleAddOns() {
		return vehicleAddOns;
	}

	@JsonProperty("vehicleAddOns")
	public void setVehicleAddOns(List<VehicleAddOn> vehicleAddOns) {
		this.vehicleAddOns = vehicleAddOns;
	}

	@JsonProperty("protectionProductsTotal")
	public Double getProtectionProductsTotal() {
		return protectionProductsTotal;
	}

	@JsonProperty("protectionProductsTotal")
	public void setProtectionProductsTotal(Double protectionProductsTotal) {
		this.protectionProductsTotal = protectionProductsTotal;
	}

	@JsonProperty("protectionProducts")
	public List<ProtectionProduct> getProtectionProducts() {
		return protectionProducts;
	}

	@JsonProperty("protectionProducts")
	public void setProtectionProducts(List<ProtectionProduct> protectionProducts) {
		this.protectionProducts = protectionProducts;
	}

	@JsonProperty("terms")
	public List<Integer> getTerms() {
		return terms;
	}

	@JsonProperty("terms")
	public void setTerms(List<Integer> terms) {
		this.terms = terms;
	}

	@JsonProperty("cashDown")
	public Integer getCashDown() {
		return cashDown;
	}

	@JsonProperty("cashDown")
	public void setCashDown(Integer cashDown) {
		this.cashDown = cashDown;
	}

	@JsonProperty("tradeIns")
	public List<TradeIn> getTradeIns() {
		return tradeIns;
	}

	@JsonProperty("tradeIns")
	public void setTradeIns(List<TradeIn> tradeIns) {
		this.tradeIns = tradeIns;
	}

	@JsonProperty("firstPaymentDueOn")
	public String getFirstPaymentDueOn() {
		return firstPaymentDueOn;
	}

	@JsonProperty("firstPaymentDueOn")
	public void setFirstPaymentDueOn(String firstPaymentDueOn) {
		this.firstPaymentDueOn = firstPaymentDueOn;
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
