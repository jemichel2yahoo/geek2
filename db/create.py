#!/usr/bin/env python
import anydbm
db = anydbm.open('jeff', 'c')
db['jeff'] = '7260343'
db['deniz'] = '2435615'
db.close()
