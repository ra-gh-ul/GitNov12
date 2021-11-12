package org.company;

public class Company {

	public void cmpId() {
		
		System.out.println("Id");

	}

	public void cmpAddress() {
		
		System.out.println("Address");
	}
     @SuppressWarnings("unused")
	 private void tam() {
     System.out.println("td");
	}
	public static void main(String[] args) {

		Company c = new Company();
		c.cmpId();
		c.cmpAddress();

	}
}
