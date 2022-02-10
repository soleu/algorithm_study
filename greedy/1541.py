# 55-50+40
import re

arr = input()
nums = list(map(int, (re.split('[+-]', arr))))
symbol = re.split('[0-9]', arr)
symbol = list(filter(None, symbol))
total = nums[len(nums) - 1]
temp = 0
for i in range(len(symbol) - 1, -1, -1):
    if (symbol[i] == "+"):
        total += nums[i]
    else:
        total = nums[i] - total
print(total)
