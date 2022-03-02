# 2606
from collections import deque

n = int(input())
pairN = int(input())
graph = [[0] * (n + 1) for _ in range(n + 1)]
for _ in range(pairN):
    a, b = map(int, input().split())
    graph[a][b] = graph[b][a] = 1  # 그래프를 그려서 매칭되는 부분에 1

##BFS -> 그래프를 그린다 -> BFS
visited = [0] * (n + 1)  # 일차원 배열 생성

def bfs(v):
    queue = deque()  # 초기화
    visited[v] = 1
    queue.append(v)
    #     # 큐가 빌때까지 반복
    while queue:
        # 큐에서 하나의 원소를 뽑아 출력
        node = queue.popleft()
        # 해당 원소와 연결된, 아직 방문하지 않은 원소 큐에 삽입
        for i in range(n + 1):
            if not visited[i] and graph[i][node] == 1:
                queue.append(i)
                visited[i] = 1

bfs(1)  # 맨처음 거 넣기
print(sum(visited)-1) #1번 컴퓨터 제외

##DFS
# n = int(input())
# m = int(input())
# graph = [[0]*(n+1) for _ in range(n+1)]
# for _ in range(m):
#     a,b = map(int,input().split())
#     graph[a][b] = graph[b][a] = 1
#
# visited = [0]*(n+1)
#
# def dfs(v):
#     visited[v] = 1
#     for i in range(n+1):
#         if graph[i][v] == 1 and visited[i] == 0:
#             dfs(i) #재귀 사용
# dfs(1)
#
# print(sum(visited)-1)

