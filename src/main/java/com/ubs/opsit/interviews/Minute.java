package com.ubs.opsit.interviews;

public class Minute extends TimeUnit {
	@Override
	public String getLampsForMultiplesOfFive(int minutes) {

		StringBuilder lamps = new StringBuilder(Lamp.ALL_ELEVEN_OFF.getValue());

		for (int i = 0; i < minutes; i++) {
			if (0 == (i + 1) % 3) {
				lamps.replace(i, i + 1, Lamp.RED_LIGHT.getValue());
			} else {
				lamps.replace(i, i + 1, Lamp.YELLOW_LIGHT.getValue());
			}
		}
		return lamps.toString();
	}

	@Override
	public String getLampsForSingleUnits(int minutes) {

		StringBuilder lamps = new StringBuilder(Lamp.ALL_FOUR_OFF.getValue());

		for (int i = 0; i < minutes; i++) {
			lamps.replace(i, i + 1, Lamp.YELLOW_LIGHT.getValue());
		}
		return lamps.toString();
	}
}
