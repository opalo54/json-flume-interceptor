package com.beeva.reportingcrm.domain;

import org.codehaus.jackson.annotate.JsonProperty;

public class ApxEvent {

	private Data Data;

	private String ContactKey;

	private String EventDefinitionKey;

	@JsonProperty("Data")
	public Data getData() {
		return Data;
	}

	public void setData(Data Data) {
		this.Data = Data;
	}

	@JsonProperty("ContactKey")
	public String getContactKey() {
		return ContactKey;
	}

	public void setContactKey(String ContactKey) {
		this.ContactKey = ContactKey;
	}

	@JsonProperty("EventDefinitionKey")
	public String getEventDefinitionKey() {
		return EventDefinitionKey;
	}

	public void setEventDefinitionKey(String EventDefinitionKey) {
		this.EventDefinitionKey = EventDefinitionKey;
	}

	@Override
	public String toString() {
		return "ClassPojo [Data = " + Data + ", ContactKey = " + ContactKey + ", EventDefinitionKey = "
				+ EventDefinitionKey + "]";
	}
}
