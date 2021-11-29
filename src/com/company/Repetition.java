package com.company;

public class Repetition {

    private boolean isEnabled = true;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public static String twice(String s) {
        return s + " " + s;
    }
}
