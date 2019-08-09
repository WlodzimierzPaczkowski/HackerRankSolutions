from itertools import *
'''
You are given a list of N lowercase English letters. For a given integer K, 
you can select any K indices (assume 1-based indexing) with a uniform probability from the list.

Find the probability that at least one of the K indices selected will contain the letter: 'a'. -HackerRank
'''
# there is empty file given to solver
# this part take input in format chosen by HackerRank,
# i eddied this a bit from one i send on site
'''
lengthOfString = int(input())
string = input().split()
thatOtherInt = int(input())
'''
# end of input

# this vale are given for first testcase
lengthOfString = 4
string = "a a c d"
thatOtherInt = 2
count = 0

# here i make "indices" for calculation of probability, with use of itertools combinations
indices = list(combinations(string, thatOtherInt))

# loop iterate list
for i in indices:
    # check if 'a' exist in indices
    if 'a' in i:
        # counting incrementation
        count = count + 1

# printing chances of a being in indices
print(count/len(indices))
