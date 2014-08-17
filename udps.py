#!/usr/bin/env python
import socket
s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
s.bind(("127.0.0.1", 5000))
(msg, peer) = s.recvfrom(4096)
print msg
print peer
