package com.ubs.opsit.interviews;

import java.io.UnsupportedEncodingException;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Test;

import static com.ubs.opsit.interviews.support.BehaviouralTestEmbedder.aBehaviouralTestRunner;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Acceptance test class that uses the JBehave (Gerkin) syntax for writing stories.  You should not need to
 * edit this class to complete the exercise, this is your definition of done.
 */
public class BerlinClockFixture {

    private TimeConverter berlinClock = new BerlinClock();
    private String theTime;

    @Test
    public void berlinClockAcceptanceTests() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("berlin-clock.story")
                .run();
    }

    @When("the time is $time")
    public void whenTheTimeIs(String time) {
        theTime = time;
    }
    
    public void printBytes(String str) {
    	try {
    		byte[] bytes = str.getBytes("US-ASCII");
    		for (byte bye : bytes) {
    			System.out.print(bye + " ");
    		}
    		System.out.print(System.lineSeparator());
    	} catch (UnsupportedEncodingException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}    	
    }

    @Then("the clock should look like $")
    public void thenTheClockShouldLookLike(String theExpectedBerlinClockOutput) {
    	String expected = theExpectedBerlinClockOutput;
    	String got = berlinClock.convertTime(theTime);
    	System.out.println("Expected : " + expected);
    	printBytes(expected);
    	System.out.println("Length : " + expected.length());
    	System.out.println("Got : " + got);
    	printBytes(got);
    	System.out.println("Length : " + got.length());
    	
        assertThat(berlinClock.convertTime(theTime)).isEqualTo(theExpectedBerlinClockOutput);
    }
}
