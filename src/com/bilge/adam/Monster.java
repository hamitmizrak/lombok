
package com.bilge.adam;

public class Monster extends Computer {

	private static final long	serialVersionUID	= 5260439605224849733L;

	private String				monsterSerial;


	// parametresiz
	public Monster ( ) {
		// TODO Auto-generated constructor stub
	}

	// parametreli constructor
	public Monster ( String computerName , String computerTrade , String monsterSerial ) {
		super ( computerName , computerTrade );
		this.monsterSerial = monsterSerial;
	}

	// toString
	@Override
	public String toString ( ) {
		return "Monster [monsterSerial=" + monsterSerial + ", getComputerName()=" + getComputerName ( )
				+ ", getComputerTrade()=" + getComputerTrade ( ) + "]";
	}

	// getter and setter
	public String getMonsterSerial ( ) {
		return monsterSerial;
	}

	public void setMonsterSerial ( String monsterSerial ) {
		this.monsterSerial = monsterSerial;
	}

	@Override
	public void denemeMethod ( ) {
		// TODO Auto-generated method stub

	}

}
