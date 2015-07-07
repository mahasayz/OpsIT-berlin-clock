package com.ubs.opsit.interviews;

public class Hour extends TimeUnit {
	private static final String ALL_LIGHTS_OFF = "OOOO";
	private static final String RED_LIGHT = "R";

	@Override
	public String getLampsForMultiplesOfFive(int hours) {

		StringBuilder lamps = new StringBuilder(ALL_LIGHTS_OFF);

		for (int i = 0; i < hours; i++) {
			lamps.replace(i, i + 1, RED_LIGHT);
		}
		return lamps.toString();
	}

	@Override
	public String getLampsForSingleUnits(int hours) {

		StringBuilder lamps = new StringBuilder(ALL_LIGHTS_OFF);

		for (int i = 0; i < hours; i++) {
			lamps.replace(i, i + 1, RED_LIGHT);
		}
		return lamps.toString();
	}
}
