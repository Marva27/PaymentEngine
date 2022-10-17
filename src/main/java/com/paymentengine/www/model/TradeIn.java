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
@JsonPropertyOrder({ "tradeInVehicle", "tradeInValue", "tradePayoff" })
@Generated("jsonschema2pojo")
public class TradeIn {

	@JsonProperty("tradeInVehicle")
	private TradeInVehicle tradeInVehicle;
	@JsonProperty("tradeInValue")
	private Integer tradeInValue;
	@JsonProperty("tradePayoff")
	private Integer tradePayoff;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("tradeInVehicle")
	public TradeInVehicle getTradeInVehicle() {
		return tradeInVehicle;
	}

	@JsonProperty("tradeInVehicle")
	public void setTradeInVehicle(TradeInVehicle tradeInVehicle) {
		this.tradeInVehicle = tradeInVehicle;
	}

	@JsonProperty("tradeInValue")
	public Integer getTradeInValue() {
		return tradeInValue;
	}

	@JsonProperty("tradeInValue")
	public void setTradeInValue(Integer tradeInValue) {
		this.tradeInValue = tradeInValue;
	}

	@JsonProperty("tradePayoff")
	public Integer getTradePayoff() {
		return tradePayoff;
	}

	@JsonProperty("tradePayoff")
	public void setTradePayoff(Integer tradePayoff) {
		this.tradePayoff = tradePayoff;
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
