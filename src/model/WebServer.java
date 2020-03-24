package model;

public class WebServer implements Runnable {
    private Request request;

    public WebServer(Request request) {
        this.request = request;
    }

    @Override
    public void run() {
        System.out.println("Thread has request - " + request);
    }
}
