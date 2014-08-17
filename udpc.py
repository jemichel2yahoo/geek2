#!/usr/bin/env python
import socket
s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
s.sendto("hi", ("127.0.0.1", 5000))
