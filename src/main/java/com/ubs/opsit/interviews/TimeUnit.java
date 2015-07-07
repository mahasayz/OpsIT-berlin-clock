package com.ubs.opsit.interviews;

public abstract class TimeUnit {

	private static StringBuilder result = new StringBuilder();
	
	public String getLamps(int unit) {
		// clearing the result
		result.setLength(0);
		
		return result.append(getLampsForMultiplesOfFive(unit / 5))
				.append(System.lineSeparator())
				.append(getLampsForSingleUnits(unit % 5)).toString();
	}
	
	public abstract String getLampsForMultiplesOfFive(int unit);
	public abstract String getLampsForSingleUnits(int unit);
	
}
