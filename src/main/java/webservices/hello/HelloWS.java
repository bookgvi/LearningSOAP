package webservices.hello;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(
        style = SOAPBinding.Style.DOCUMENT,
        use = SOAPBinding.Use.LITERAL
)
public interface HelloWS {

    @WebMethod
    public String getHello(@WebParam(name = "name", partName = "name") String name);
}
