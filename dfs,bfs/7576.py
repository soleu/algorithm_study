# 7576 토마토
# bfs로 풀기
from collections import deque


def bfs():
    while queue:
        x, y = queue.popleft()  # 처음 토마토 좌표 x,y
        for i in range(4):
            nx, ny = dx[i] + x, dy[i] + y  # 사분면으로 토마토 익히기
            if n > nx >= 0 and m > ny >= 0 and bucket[nx][ny] == 0:
                bucket[nx][ny] = bucket[x][y] + 1
                queue.append([nx, ny])


m, n = map(int, input().split())
# 2차원 배열 입력 받기
bucket = []
for i in range(n):
    bucket.append(list(map(int, input().split())))
queue = deque([])  # 초기화, 좌표이므로 []
dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
cnt = 0

for i in range(n):
    for j in range(m):
        if bucket[i][j] == 1:  # 1인 것 토마토 익히기 시작
            queue.append([i, j])
            # print(queue)#deque([[3,5]])
bfs()
for i in bucket:
    for j in i:
        if j == 0:  # 토마토 다 못 익힘
            print(-1)
            exit(0)
    cnt = max(cnt, max(i))
print(cnt - 1)
