###이진 탐색을 이용한 Lower Bound, Upper Bound 알고리즘 사용
#숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.
preCnt = int(input())
preN = list(map(int, input().split()))
inCnt = int(input())
inN = list(map(int, input().split()))
preN.sort()
for i in range(inCnt):
    result = 0
    pl=0
    pr=preCnt
    lowerFlag = -1
    upperFlag = -1
    while True:
        pc = (pl + pr) // 2
        if pl >= pr:
            break
        if inN[i] <= preN[pc]:
            pr = pc # lower bound : 처음 나오는 위치 찾기
            if(inN[i]==preN[pc]):
                lowerFlag = pc
        else:
            pl = pc+1
    pl=0
    pr=preCnt
    while True:
        pc = (pl + pr) // 2
        if pl >= pr:
            break
        if inN[i] >= preN[pc]:
            pl = pc + 1
            if(inN[i]==preN[pc]):
                upperFlag = pl
        else:
            pr = pc
    print(upperFlag-lowerFlag,end=' ')
