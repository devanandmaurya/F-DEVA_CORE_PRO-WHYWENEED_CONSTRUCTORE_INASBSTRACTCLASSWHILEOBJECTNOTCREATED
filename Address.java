package com.dkh.aggrefration;

public class Address {
	private int pincod;
	private String citty;

	
	
	/*public Address(int pincod, String citty) {
		super();
		this.pincod = pincod;
		this.citty = citty;
	}*/

	public int getPincod() {
		return pincod;
	}

	public void setPincod(int pincod) {
		this.pincod = pincod;
	}

	public String getCitty() {
		return citty;
	}

	public void setCitty(String citty) {
		this.citty = citty;
	}

	@Override
	public String toString() {
		return "Address [pincod=" + pincod + ", citty=" + citty + "]";
	}

}
