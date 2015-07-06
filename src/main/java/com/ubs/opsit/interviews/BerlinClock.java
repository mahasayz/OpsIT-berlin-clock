package com.ubs.opsit.interviews;

import java.util.ArrayList;
import java.util.List;

public class BerlinClock implements TimeConverter{

	private static List<TimeUnit> timeUnits = new ArrayList<TimeUnit>();
	
	public BerlinClock() {
		timeUnits.add(new Second());
		timeUnits.add(new Hour());
		timeUnits.add(new Minute());
	}
	
	@Override
	public String convertTime(String aTime) {
		// TODO Auto-generated method stub
		StringBuilder timeSB = new StringBuilder();
		String[] timeElements = aTime.split(":");
		
		timeSB.append(timeUnits.get(0).getLamps(Integer.parseInt(timeElements[2]))).append(System.lineSeparator());
		timeSB.append(timeUnits.get(1).getLamps(Integer.parseInt(timeElements[0]))).append(System.lineSeparator());
		timeSB.append(timeUnits.get(2).getLamps(Integer.parseInt(timeElements[1])));
		
		return timeSB.toString();
	}

}
