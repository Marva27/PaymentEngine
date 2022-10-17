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
@JsonPropertyOrder({ "address", "creditTier", "subjectiveQualifierCodes" })
@Generated("jsonschema2pojo")
public class Customer {

	@JsonProperty("address")
	private Address address;
	@JsonProperty("creditTier")
	private String creditTier;
	@JsonProperty("subjectiveQualifierCodes")
	private List<Object> subjectiveQualifierCodes = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("address")
	public Address getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(Address address) {
		this.address = address;
	}

	@JsonProperty("creditTier")
	public String getCreditTier() {
		return creditTier;
	}

	@JsonProperty("creditTier")
	public void setCreditTier(String creditTier) {
		this.creditTier = creditTier;
	}

	@JsonProperty("subjectiveQualifierCodes")
	public List<Object> getSubjectiveQualifierCodes() {
		return subjectiveQualifierCodes;
	}

	@JsonProperty("subjectiveQualifierCodes")
	public void setSubjectiveQualifierCodes(List<Object> subjectiveQualifierCodes) {
		this.subjectiveQualifierCodes = subjectiveQualifierCodes;
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
