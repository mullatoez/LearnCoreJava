package com.company.switchExpressionDemo;

public class SwitchExpressionDemo {
    public static void main(String[] args) {

        String sport = "Football";
        String bestPlayer = "";
        switch (sport) {
            case "Tennis":
                bestPlayer = "XXX";
                break;
            case "Hockey":
                bestPlayer = "YYY";
                break;
            case "Football":
                bestPlayer = "YEEY";
                break;
        }

        //switch expression
       /* String bestPlayer1 = switch (sport) {
            case "Tennis" -> "XXX";
            case "Hockey" -> "YYY";
            case "Football" -> "YEEY";
            default -> "Unknown";
        };*/
    }
}
