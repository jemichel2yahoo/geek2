#!/usr/bin/env python
import socket
s = socket.socket(socket.AF_UNIX, socket.SOCK_DGRAM)
s.bind("/tmp/unixs")
(msg, peer) = s.recvfrom(4096)
print msg
print peer
