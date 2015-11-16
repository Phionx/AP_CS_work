def coin(d, inc):
	ways = [1]+[0] * d
	print(str(ways)+"\n")
	for c in inc:
		for i in range(c, d + 1):
   		     	ways[i] += ways[i - c]
			print(str(ways) + "\n")
	return  str(ways[d])

print(coin(5,[2]))


