#!/usr/bin/env python
import anydbm
db = anydbm.open('jeff')
for k in db.keys():
	print k, '\t', db[k]
db.close()
