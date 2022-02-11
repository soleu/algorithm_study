sepNums = input().split('-')
result = 0
for i in range(len(sepNums)):
    addNums = list(map(int, sepNums[i].split('+')))
    if (i == 0):
        result = sum(addNums)
    else:
        result -= sum(addNums)
print(result)
