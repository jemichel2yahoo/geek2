#!/usr/bin/env python
import socket
s = socket.socket(socket.AF_INET6, socket.SOCK_DGRAM)
s.sendto("hi", ("::1", 5000, 0, 0))
