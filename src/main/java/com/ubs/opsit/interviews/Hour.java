package com.ubs.opsit.interviews;

public class Hour extends TimeUnit {
	@Override
	public String getLampsForMultiplesOfFive(int hours) {

		StringBuilder lamps = new StringBuilder(Lamp.ALL_FOUR_OFF.getValue());

		for (int i = 0; i < hours; i++) {
			lamps.replace(i, i + 1, Lamp.RED_LIGHT.getValue());
		}
		return lamps.toString();
	}

	@Override
	public String getLampsForSingleUnits(int hours) {

		StringBuilder lamps = new StringBuilder(Lamp.ALL_FOUR_OFF.getValue());

		for (int i = 0; i < hours; i++) {
			lamps.replace(i, i + 1, Lamp.RED_LIGHT.getValue());
		}
		return lamps.toString();
	}
}
