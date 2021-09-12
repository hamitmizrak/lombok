
package com.bilge.adam;

public class ComputerMainTest {

	public static void main ( String [ ] args ) {

		Computer person = new Msi ( ); // polymorphism

		Computer person2 = new Monster ( "MsiGl75" , "15000" , "monster75845Xyz" ); // polymorphism
		System.out.println ( person2 );
		person2.deneme ( );
		person2.denemeMethod ( );
	}

}
