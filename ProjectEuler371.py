expectedVal,help=0,0
for i in xrange(250, -1, -1):
  help = (1000 + (998.0-2*i) * help) / (999-i)
  expectedVal = (1000 + (998.0-2*i) * expectedVal + help) / (999-i)
print "%.8f" % expectedVal