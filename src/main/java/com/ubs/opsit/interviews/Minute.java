package com.ubs.opsit.interviews;

public class Minute extends TimeUnit {
	private static final String RED_LIGHT = "R";
	private static final String YELLOW_LIGHT = "Y";
	private static final String ALL_FOUR_LIGHTS_OFF = "OOOO";
	private static final String ALL_ELEVEN_LIGHTS_OFF = "OOOOOOOOOOO";

	@Override
	public String getLampsForMultiplesOfFive(int minutes) {

		StringBuilder lamps = new StringBuilder(ALL_ELEVEN_LIGHTS_OFF);

		for (int i = 0; i < minutes; i++) {
			if (0 == (i + 1) % 3) {
				lamps.replace(i, i + 1, RED_LIGHT);
			} else {
				lamps.replace(i, i + 1, YELLOW_LIGHT);
			}
		}
		return lamps.toString();
	}

	@Override
	public String getLampsForSingleUnits(int minutes) {

		StringBuilder lamps = new StringBuilder(ALL_FOUR_LIGHTS_OFF);

		for (int i = 0; i < minutes; i++) {
			lamps.replace(i, i + 1, YELLOW_LIGHT);
		}
		return lamps.toString();
	}
}
