# 1697 숨바꼭질
##배열 크기 잘 생각하기
##가장 짧은, 가장 빠른 -> BFS
import sys
from collections import deque

input = sys.stdin.readline()

# bfs
def bfs():
    # queue 생성
    queue = deque()
    # 큐에 넣기
    queue.append(n)
    # 세가지 경우의 수 확인
    while queue:
        x = queue.popleft()
        # 찾았을 경우
        if x == k:
            print(dist[x])
        for i in (2 * x, x - 1, x + 1):
            if 0 <= i <= MAX and not dist[i]:
                queue.append(i)
                dist[i] = dist[x] + 1 #depth + 1


# 입력
n, k = map(int, input.split())
MAX = 100000
# dist 배열 생성 (visited + depth 기능)
dist = [0] * (MAX + 1)
# bfs 함수 호출
bfs()
