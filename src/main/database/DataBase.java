package main.database;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class DataBase implements Runnable {

    public static Map<LocalDate, Integer> dateOfPaymentMap = new HashMap<>();

    public void put(LocalDate date, Integer paymentAmount) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        dateOfPaymentMap.put(date, paymentAmount);
        System.out.println("Next index" + dateOfPaymentMap);
        lock.lock();
    }

    public Integer getByDate(LocalDate date) {
        Integer paymentByDate = dateOfPaymentMap.get(date);
        if (paymentByDate == null) {
            System.out.println("There are no payment for this date");
        } else {
            System.out.println("The payment for this day is: " + paymentByDate);
        }
        return paymentByDate;
    }

    public void outputDates() {
        System.out.println(dateOfPaymentMap.keySet());
    }

    public void outputPayment() {
        System.out.println(dateOfPaymentMap.values());
    }

    @Override
    public void run() {
        outputDates();
        outputPayment();
        getByDate(LocalDate.of(2020, 3, 24));
    }
}
