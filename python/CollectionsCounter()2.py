from collections import Counter

# Input is in txt file in repositories, other than that it is same as CollectionsCounter()
# so just hit run to get output 200 for default test case
with open("CollectionsCounter()2input", 'r') as f:

    N = int(f.readline())
    ShopOwnerSupply = Counter(f.readline().split())
    MoneyEarned = 0
    NumberOfCustomers = int(f.readline())

    for customers in range(0, NumberOfCustomers):

        Inp = f.readline().split()

        if Inp[0] in ShopOwnerSupply and ShopOwnerSupply.get(Inp[0]) > 0:
            ShopOwnerSupply[Inp[0]] -= 1

            MoneyEarned += int(Inp[1])

    print(MoneyEarned)
