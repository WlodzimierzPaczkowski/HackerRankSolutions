'''
Now, let's use our knowledge of sets and help Mickey.

Ms. Gabriel Williams is a botany professor at District College. One day, she asked her student Mickey to compute
the average of all the plants with distinct heights in her greenhouse. - HackerRank
'''


# average, it could be done with looping array to get sum and divide
def average(array):
    averageset = set(array)
# simple sum divided by len
    return sum(averageset) / len(averageset)


# only change will be chane of input() to strings from taste case
if __name__ == '__main__':                  # this was part of pre made code for this one
    n = int("10")                        # changed int(input()) to int("")
    arr = list(map(int, "161 182 161 154 176 170 167 171 170 174".split()))   # changed input().split() to "".split()
    result = average(arr)                   # this was part of pre made code for this one
    print(result)                           # this was part of pre made code for this one
