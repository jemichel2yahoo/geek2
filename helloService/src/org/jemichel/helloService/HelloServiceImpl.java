package org.jemichel.helloService;
 
import javax.jws.WebService;
 
// Service Endpoint Implementation Class
@WebService(endpointInterface = "org.jemichel.helloService.HelloService")
public class HelloServiceImpl implements HelloService
{
	@Override
	public String getHelloWorldAsString(String suffix)
	{
		return "Hello World JAX-WS " + suffix;
	}
}
