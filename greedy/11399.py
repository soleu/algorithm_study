N = int(input())
arr = list(map(int, input().split()))
arr.sort()
result = 0
idx = 0
for i in range(N, 0, -1):
    result += i * arr[idx]
    idx += 1
print(result)
