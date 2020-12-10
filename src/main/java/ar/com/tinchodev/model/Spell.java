package ar.com.tinchodev.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Spell {
	/*
	 * private String id; private String nombre; private String catgeoria; private
	 * String efecto; private String image; private float valor; public String
	 * getId() { return id; } public void setId(String id) { this.id = id; } public
	 * String getNombre() { return nombre; } public void setNombre(String nombre) {
	 * this.nombre = nombre; } public String getCatgeoria() { return catgeoria; }
	 * public void setCatgeoria(String catgeoria) { this.catgeoria = catgeoria; }
	 * public String getEfecto() { return efecto; } public void setEfecto(String
	 * efecto) { this.efecto = efecto; } public String getImage() { return image; }
	 * public void setImage(String image) { this.image = image; } public float
	 * getValor() { return valor; } public void setValor(float valor) { this.valor =
	 * valor; }
	 */

	private String street;
	private String streetName;
	private String buildingNumber;
	private String city;
	private String zipcode;
	private String country;
	private String county_code;
	private float latitude;
	private float longitude;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCounty_code() {
		return county_code;
	}

	public void setCounty_code(String county_code) {
		this.county_code = county_code;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

}
