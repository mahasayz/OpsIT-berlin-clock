package com.ubs.opsit.interviews;

public class Second extends TimeUnit {

	@Override
	public String getLamps(int seconds) {
		if (0 == seconds % 2) {
			return "Y";
		}
		return "O";
	}

	@Override
	public String getLampsForMultiplesOfFive(int unit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLampsForSingleUnits(int unit) {
		// TODO Auto-generated method stub
		return null;
	}

}
