package com.ubs.opsit.interviews;


public class Second extends TimeUnit {

	@Override
	public String getLamps(int seconds) {
		if (0 == seconds % 2) {
			return Lamp.YELLOW_LIGHT.getValue();
		}
		return Lamp.SINGLE_OFF.getValue();
	}

	@Override
	public String getLampsForMultiplesOfFive(int unit) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Seconds unit does not depend on multiples of 5 logic");
	}

	@Override
	public String getLampsForSingleUnits(int unit) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Seconds unit does not depend on single units logic");
	}

}
