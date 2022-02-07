# 첫째 줄에 N개를 만들 수 있는 랜선의 최대 길이를 센티미터 단위의 정수로 출력한다.

k, n = map(int, input().split())
lines = []
for _ in range(k):
    lines.append(int(input()))
lines.sort()  # 정렬
result = 0
pl = 1
pr = lines[k - 1]  # 랜선의 최대값을 최대값으로 설정 (중앙값으로 계산을 하니까, 최대값을 생각해야함!)
while pr >= pl:
    lineCnt = 0  # 자른 랜선의 개수
    pc = (pl + pr) // 2
    for i in range(k):  # 모든 랜선을 자름
        lineCnt += lines[i] // pc
    if (lineCnt < n):
        pr = pc - 1
    else:
        pl = pc + 1
        result = pc
print(result)
