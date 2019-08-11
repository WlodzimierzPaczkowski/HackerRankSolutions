from cmath import *
'''
You are given a complex z. Your task is to convert it to polar coordinates. - HackerRank
'''
'''
sample input:
1+2j
sample output:
2.23606797749979
1.1071487177940904
'''
# this one is weird, it want you to use abs and phase of cmath to find polar coordinates of complex number
# so, take input and print two methods of this input
Inp = "1+2j"  # input() or with open("txt file with input", 'r') as f: complex(f.readline())
print(abs(complex(Inp)))
print(phase(complex(Inp)))

