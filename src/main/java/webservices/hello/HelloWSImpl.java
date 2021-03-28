package webservices.hello;

import javax.jws.WebService;

@WebService(endpointInterface = "webservices.hello.HelloWS")
public class HelloWSImpl implements HelloWS {

    @Override
    public String getHello(String name) {
        return "Hello, " + name ;
    }
}
