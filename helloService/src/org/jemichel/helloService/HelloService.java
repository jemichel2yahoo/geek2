package org.jemichel.helloService;
 
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
 
// Service Endpoint Interface
@WebService
public interface HelloService
{
	@WebMethod String getHelloWorldAsString(@WebParam(name="suffix") String suffix);
}
