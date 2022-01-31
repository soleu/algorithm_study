# N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
preCnt = int(input())
preN = list(map(int, input().split()))
inCnt = int(input())
inN = list(map(int, input().split()))
preN.sort()
for i in range(inCnt):
    result=0
    pl=0
    pr=preCnt-1
    while True:
        pc = (pl + pr) // 2
        if pl > pr:
            result = 0
            break
        if inN[i] == preN[pc]:
            result = 1
            break
        elif inN[i] < preN[pc]:
            pr = pc-1
        else:
            pl = pc+1
    print(result)
