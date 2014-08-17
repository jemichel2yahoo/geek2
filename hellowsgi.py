#!/usr/bin/env python
from wsgiref.simple_server import make_server

def simple_app(environ, start_response):
    status = '200 OK'
    headers = [('Content-type', 'text/plain')]
    start_response(status, headers)
    return "hello world\n"

make_server('', 8080, simple_app).serve_forever()
