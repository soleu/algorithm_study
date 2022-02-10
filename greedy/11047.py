n, k = map(int, input().split())
nums = []
for _ in range(n):
    nums.append(int(input()))
nums.reverse()
cnt = 0
for i in nums:
    if k // i != 0:
        cnt += k // i
        k %= i
print(cnt)
