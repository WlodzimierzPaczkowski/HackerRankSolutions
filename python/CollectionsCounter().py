from collections import Counter

'''
Raghu is a shoe shop owner. His shop has X number of shoes.
He has a list containing the size of each shoe he has in his shop.
There are N number of customers who are willing to pay x
amount of money only if they get the shoe of their desired size.

Your task is to compute how much money Raghu earned. -HackerRank


format of input
number of shoes
supply of shoes
number of customers (must be equal to amount of customers orders)
customers orders (how much you want)
sample input:
10
2 3 4 5 6 8 7 6 5 18
6
6 55
6 45
6 55
4 40
18 60
10 50

sample output:
200

'''

# this is original code, i will need to change it a lot to be able to make it simple
# standalone python program that works when you hit run (done that in sequel to CollectionsCounter(), CollectionsCounter() 2 Electric Boogaloo)
# first we take 10 from input, it show number of shoes shop owner have, but it isn't
# useful for my solution, so i just put it in N so i can get rest of input
N = int(input())
# here i create counter type dict to hold shoe size in key and amount of those shoes in value
ShopOwnerSupply = Counter(input().split())
# here is variable for earning
MoneyEarned = 0
# here number of customers, i use it a bit later
NumberOfCustomers = int(input())
# here i loop all customers and use NumberOfCustomers variable
for customers in range(0, NumberOfCustomers):
    # here i take next order of customer to check
    Inp = input().split()
    # if shop owner supply have shoes in their desired size, both if he have size and if he
    # still got them in supply (other customers could buy all of them)
    if Inp[0] in ShopOwnerSupply and ShopOwnerSupply.get(Inp[0]) > 0:
        # here i take shoes vale from supply
        ShopOwnerSupply[Inp[0]] -= 1
        # here i add profits to MoneyEarned variable
        MoneyEarned += int(Inp[1])

# print of output
print(MoneyEarned)

