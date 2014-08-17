#!/usr/bin/env python
import socket
s = socket.socket(socket.AF_INET6, socket.SOCK_DGRAM)
s.bind(("::1", 5000, 0, 0))
(msg, peer) = s.recvfrom(4096)
print msg
print peer
