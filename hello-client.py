#!/usr/bin/env python
import suds
url = "http://localhost:8080/HelloService/hello?wsdl"
client = suds.client.Client(url)
print client
print client.service.getHelloWorldAsString("Baby Jeff")
