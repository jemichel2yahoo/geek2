#!/usr/bin/env python
from wsgiref.simple_server import make_server

def simple_app(environ, start_response):
    status = '200 OK'
    headers = [('Content-type', 'text/plain')]
    start_response(status, headers)
    try:
        request_body_size = int(environ.get('CONTENT_LENGTH', 0))
    except (ValueError):
        request_body_size = 0

    request_body = environ['wsgi.input'].read(request_body_size)
    return "POST entity body was: " + request_body + "\n"

httpd = make_server('', 8080, simple_app)
httpd.serve_forever()
