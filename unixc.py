#!/usr/bin/env python
import socket
s = socket.socket(socket.AF_UNIX, socket.SOCK_DGRAM)
s.sendto("hi", "/tmp/unixs")
