package com.ubs.opsit.interviews;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BerlinClock implements TimeConverter{

	@Override
	public String convertTime(String aTime) {
		// TODO Auto-generated method stub
		StringBuilder timeSB = new StringBuilder();
		
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		
		try {
			cal.setTime(formatter.parse(aTime));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/**
		 * Finding the following scenario ambiguous in case of Berlin Clock
		 * 12 Midnight can be represented both as 00:00:00 or 24:00:00
		 * 
		 * Both time formats mean the same but have different representations in
		 * terms of lamp light-up mechanisms, like
		 * 
		 * 00:00:00 is represented as
		 * Y
		 * 0000
		 * 0000
		 * 00000000000
		 * 0000
		 * 
		 * 24:00:00 is represented as
		 * Y
		 * RRRR
		 * RRRR
		 * 00000000000
		 * 0000
		 */
		
		String hour = aTime.substring(0, aTime.indexOf(":"));
		
		timeSB.append(new Second().getLamps(cal.get(Calendar.SECOND))).append(System.lineSeparator());
		
		// A check on hour portion in relation to above ambiguity
		if (hour.equals("24"))
			timeSB.append(new Hour().getLamps(24)).append(System.lineSeparator());
		else
			timeSB.append(new Hour().getLamps(cal.get(Calendar.HOUR_OF_DAY))).append(System.lineSeparator());
		
		timeSB.append(new Minute().getLamps(cal.get(Calendar.MINUTE)));
		
		return timeSB.toString();
	}

}
