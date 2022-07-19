package de.alcantara.betriebsstellen.model;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Station {

	private String code;

	@JsonProperty("Name")
	private String name;

	@JsonProperty("Kurzname")
	private String shortName;

	@JsonProperty("Typ")
	private String typ;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Value("Kurzname")
	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	@Override
	public String toString() {
		return "Station [code=" + code + ", name=" + name + ", shortName=" + shortName + ", typ=" + typ + "]";
	}

}
