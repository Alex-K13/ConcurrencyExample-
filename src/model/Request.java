package model;

public class Request {

    private String address;
    private String request;

    public Request(String request, String address) {
        this.request = request;
        this.address = address;
    }

    public String toString(){
        return request + " from " + address;
    }

}
