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

    ##집합 자료형을 통한 포함 여부 확인
# from sys import stdin,stdout
# preCnt = stdin.readline()
# preN = set(stdin.readline().split())
# inCnt = stdin.readline()
# inN = set(stdin.readline().split())
#
# for l in inN:
#     stdout.write('1\n') if l in preN else stdout.write('0\n')
#     #set 내장 함수를 통해 중복 여부 확인. in의 요소를 순회하면서 포함되면 1, 아니면 0