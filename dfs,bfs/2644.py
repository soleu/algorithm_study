# 2644 촌수계산
from collections import deque

def bfs():
    while queue:
        depth, target = queue.popleft()  # depth : 깊이, target:현재 위치
        visited[target] = 1  # 방문 체크
        for i in range(n+1):
            if not visited[i] and graph[i][target] == 1:
                queue.append((depth + 1, i))
                if i == b:  # 목표 찾음
                    return depth + 1

# 입력 부분
n = int(input())
a, b = map(int, input().split())
m = int(input())
graph = [[0] * (n + 1) for _ in range(n + 1)]

for _ in range(m):
    x, y = map(int, input().split())
    graph[x][y] = graph[y][x] = 1

# 촌수 계산
visited = [0] * (n + 1)
queue = deque()  # 초기화
queue.append((0, a))
result = bfs()
if not result:
    result = -1
print(result)
