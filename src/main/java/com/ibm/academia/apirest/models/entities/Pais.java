package com.ibm.academia.apirest.models.entities;

import java.io.Serializable;
import java.util.Objects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Pais implements Serializable{
	
	
	private String countryCode;
	
	private String countryCode3;
	
	private String countryName;
	
	private String countryEmoji;
	
	public Pais(String countryCode, String countryCode3, String countryName, String countryEmoji) {
		super();
		this.countryCode = countryCode;
		this.countryCode3 = countryCode3;
		this.countryName = countryName;
		this.countryEmoji = countryEmoji;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(countryCode, countryCode3, countryEmoji, countryName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return Objects.equals(countryCode, other.countryCode) && Objects.equals(countryCode3, other.countryCode3)
				&& Objects.equals(countryEmoji, other.countryEmoji) && Objects.equals(countryName, other.countryName);
	}

	private static final long serialVersionUID = -7748917568065689343L;

}
