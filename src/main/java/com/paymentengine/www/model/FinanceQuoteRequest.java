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
@JsonPropertyOrder({ "financeQuoteRequest" })
@Generated("jsonschema2pojo")
public class FinanceQuoteRequest {

	@JsonProperty("financeQuoteRequest")
	private FinanceQuoteRequest__1 financeQuoteRequest;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("financeQuoteRequest")
	public FinanceQuoteRequest__1 getFinanceQuoteRequest() {
		return financeQuoteRequest;
	}

	@JsonProperty("financeQuoteRequest")
	public void setFinanceQuoteRequest(FinanceQuoteRequest__1 financeQuoteRequest) {
		this.financeQuoteRequest = financeQuoteRequest;
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
