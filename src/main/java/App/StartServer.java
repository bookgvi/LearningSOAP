package App;

import webservices.hello.HelloWSImpl;

import javax.xml.ws.Endpoint;

public class StartServer {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/ws/hello", new HelloWSImpl());
    }
}
