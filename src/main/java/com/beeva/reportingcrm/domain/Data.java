package com.beeva.reportingcrm.domain;

import org.codehaus.jackson.annotate.JsonProperty;

public class Data {
	private String DES_DOMCOPRO;

	private String UUID;

	private String EmailAddress;

	private String COD_IDIOMA;

	private String XTI_SEXO;

	private String DES_NOMPILA;

	private String SubscriberKey;

	@JsonProperty("DES_DOMCOPRO")
	public String getDES_DOMCOPRO() {
		return DES_DOMCOPRO;
	}

	public void setDES_DOMCOPRO(String DES_DOMCOPRO) {
		this.DES_DOMCOPRO = DES_DOMCOPRO;
	}

	@JsonProperty("UUID")
	public String getUUID() {
		return UUID;
	}

	public void setUUID(String UUID) {
		this.UUID = UUID;
	}

	@JsonProperty("EmailAddress")
	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String EmailAddress) {
		this.EmailAddress = EmailAddress;
	}

	@JsonProperty("COD_IDIOMA")
	public String getCOD_IDIOMA() {
		return COD_IDIOMA;
	}

	public void setCOD_IDIOMA(String COD_IDIOMA) {
		this.COD_IDIOMA = COD_IDIOMA;
	}

	@JsonProperty("XTI_SEXO")
	public String getXTI_SEXO() {
		return XTI_SEXO;
	}

	public void setXTI_SEXO(String XTI_SEXO) {
		this.XTI_SEXO = XTI_SEXO;
	}

	@JsonProperty("DES_NOMPILA")
	public String getDES_NOMPILA() {
		return DES_NOMPILA;
	}

	public void setDES_NOMPILA(String DES_NOMPILA) {
		this.DES_NOMPILA = DES_NOMPILA;
	}

	@JsonProperty("SubscriberKey")
	public String getSubscriberKey() {
		return SubscriberKey;
	}

	public void setSubscriberKey(String SubscriberKey) {
		this.SubscriberKey = SubscriberKey;
	}

	@Override
	public String toString() {
		return "ClassPojo [DES_DOMCOPRO = " + DES_DOMCOPRO + ", UUID = " + UUID + ", EmailAddress = " + EmailAddress
				+ ", COD_IDIOMA = " + COD_IDIOMA + ", XTI_SEXO = " + XTI_SEXO + ", DES_NOMPILA = " + DES_NOMPILA
				+ ", SubscriberKey = " + SubscriberKey + "]";
	}
}
