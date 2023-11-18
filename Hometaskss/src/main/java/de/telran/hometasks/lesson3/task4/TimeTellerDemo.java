package de.telran.hometasks.lesson3.task4;

public class TimeTellerDemo {
    public static void main(String[] args) {
        TimeTeller timeTeller = new TimeTeller();

        int secondsRemaining = timeTeller.secondsRemaining;
        System.out.println("Осталось секунд " + secondsRemaining);

        timeTeller.printHoursRemaining(secondsRemaining);
    }
}
