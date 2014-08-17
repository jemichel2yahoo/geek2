#!/usr/bin/env python
import anydbm
db = anydbm.open('jeff', 'w')
for k in db.keys():
	print 'deleting', k, '\t', db[k]
	del db[k]
db.close()
