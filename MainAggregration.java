package com.dkh.aggrefration;
public class MainAggregration {
public static void main(String[] args) {
		Address address = new Address();
		address.setPincod(1212);
		address.setCitty("Mumabi malad");
		Employee employee = new Employee(12, "devanand", address);
		System.out.println(employee);
		// now let us destroye employee
		employee = null;
		System.out.println("*****************************************");
		System.out.println("After destroye employee object ADDRESS ONJECT IS NOT DESTROYS AND NOT NULL");
		System.out.println(address);
		System.out.println("--------------due to destroyed emp null show ------------------------------");
		System.out.println(employee);
	}
}
////It means in case of aggregation object are independent ADDRESS AND EMPLOYEE


//Employee [id=12, name=devanand, address=Address [pincod=1212, citty=Mumabi malad]]
//*********
//After destroy employee
//Address [pincodr=1212, citty=Mumabi malad]
//null
