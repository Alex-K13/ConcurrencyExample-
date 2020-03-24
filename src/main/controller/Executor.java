package main.controller;

import main.database.DataBase;

import java.time.LocalDate;

public class Executor {
    public static void run() {
        DataBase dataBase = new DataBase();

        dataBase.put(LocalDate.of(2020, 1, 12), 1254);
        dataBase.put(LocalDate.of(2020, 2, 15), 5987);
        dataBase.put(LocalDate.of(2020, 2, 26), 5712);
        dataBase.put(LocalDate.of(2020, 2, 28), 23677);
        dataBase.put(LocalDate.of(2020, 3, 1), 1124);
        dataBase.put(LocalDate.of(2020, 3, 6), 22578);
        dataBase.put(LocalDate.of(2020, 3, 13), 3650);

        Thread readThread = new Thread(new DataBase());
        readThread.start();
    }
}
