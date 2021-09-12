
package com.bilge.adam;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
abstract public class Computer implements Serializable {

	private static final long	serialVersionUID	= 2042093716094894558L;

	private String				computerName;
	private String				computerTrade;


	// g�vdeli metot
	public void deneme ( ) {
		System.out.println ( "Computer method" );
	}

	// g�vdesiz method
	public abstract void denemeMethod ( );

}
