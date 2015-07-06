package com.ubs.opsit.interviews;

public class Second implements TimeUnit {

    @Override
    public String getLamps(int seconds) {

        if (0 == seconds%2) {
            return "Y";
        }

        return "O";
    }
    
}
