package controller;

import model.Request;
import model.WebServer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
    public static void run(){

        ExecutorService firstExecutorService = Executors.newSingleThreadExecutor();
        firstExecutorService.submit( new WebServer(new Request("DELETE", "98@ukr.net")));

        ExecutorService secondExecutorService = Executors.newSingleThreadExecutor();
        secondExecutorService.submit( new WebServer(new Request("GET", "76@ukr.net")));

        ExecutorService thirdExecutorService = Executors.newSingleThreadExecutor();
        thirdExecutorService.submit( new WebServer(new Request("HEAD", "54@ukr.net")));

        ExecutorService fourthExecutorService = Executors.newSingleThreadExecutor();
        fourthExecutorService.submit( new WebServer(new Request("PUT", "32@ukr.net")));

        ExecutorService fifthExecutorService = Executors.newSingleThreadExecutor();
        fifthExecutorService.submit( new WebServer(new Request("POST", "10@ukr.net")));

    }
}
