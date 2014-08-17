#!/usr/bin/env python
import anydbm
db = anydbm.open('jeff', 'w')
for k in db.keys():
	print k, '\t', db[k]
	db[k] = '804' + db[k]
	print k, '\t', db[k]
db.close()
