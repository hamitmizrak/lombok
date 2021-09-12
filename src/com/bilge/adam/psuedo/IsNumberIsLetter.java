package com.bilge.adam.psuedo;

public class IsNumberIsLetter {
	public static void main(String[] args) {
		// char isNumber = '&';
		String value = "c";
		char isNumber = value.charAt(0);
		if (Character.isDigit(isNumber)) {
			System.out.println("sayýdýr");
		} else if (Character.isLetter(isNumber)) {
			System.out.println("harftir");
		} else {
			System.out.println("sayý veya harf deðildir");
		}
	}
}
