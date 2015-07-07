package com.ubs.opsit.interviews;

public enum Lamp {
	SINGLE_OFF ("O"),
	ALL_FOUR_OFF ("OOOO"),
	ALL_ELEVEN_OFF ("OOOOOOOOOOO"),
	YELLOW_LIGHT ("Y"),
	RED_LIGHT ("R");
	
	private String value;
	
	private Lamp(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}
