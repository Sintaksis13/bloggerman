package com.bloggerman.dictionary.newword;

import java.util.concurrent.TimeUnit;

public enum NotificationShift {
    FIRST(TimeUnit.MINUTES.toMillis(20)),
    SECOND(TimeUnit.HOURS.toMillis(8)),
    THIRD(TimeUnit.HOURS.toMillis(24)),
    OTHERS(TimeUnit.DAYS.toMillis(2));

    private final long millis;

    NotificationShift(long millis) {
        this.millis = millis;
    }

    public long getMillis() {
        return millis;
    }

    public NotificationShift getNext() {
        switch (this) {
            case FIRST: return SECOND;
            case SECOND: return THIRD;
            default: return OTHERS;
        }
    }
}
