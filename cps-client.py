#!/usr/bin/env python
import suds
url = "http://localhost:8080/cps-ws/sample?wsdl"
client = suds.client.Client(url)
print client
print client.service.getBase()
