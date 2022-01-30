# 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
n=int(input())
numbers=map(int,input().split())
cnt=0
for i in numbers:
    if(i==1):
        continue
    for j in range(2,i):
        if(i%j==0) : break
    else:
        cnt+=1
print(cnt)

# 모법 답안 #일반 소수 계산에 FLAG로 해결
#n=int(input())
# li=list(map(int,input().split())) //리스트로 여러개 받는 방법
# cnt=0
# for i in li:
#     f=True
#     if i<=1:continue
#     for j in range(2,i):
#         if i%j==0:
#             f=False
#             break
#     if f:
#         cnt+=1
# print(cnt)
