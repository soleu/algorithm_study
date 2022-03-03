# 1697 숨바꼭질
from collections import deque


# bfs
def bfs(start):
    # 큐에 넣기
    queue.append(start)
    # 방문 확인
    visited[start] = True
    # 세가지 경우의 수 확인
    while queue:
        x = queue.popleft()

        queue.append(2*x)
        queue.append(x-1)
        queue.append(x+1)
        # 찾았을 경우
        if x==k:
            return cnt+1;

# 입력
n, k = map(int, input().split())
# visited 배열 생성
visited = [max(n, k) + 1]
# queue 생성
queue = deque()
# bfs 함수 호출
bfs(n)
