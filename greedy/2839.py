#2839 설탕 배달
N = int(input())
m=0
n = 0
num = N
m = num//5 #5를 나눌 수로, m을 설정
result=-1
#For문 사용
for i in range(m,-1,-1):
    n=(N-(i*5))//3
    if(i*5)+(n*3)==N:
        result=i+n
        break
print(result)

#While문 사용
# while m >= 0:
#     num = N-(m*5)
#     if(num % 3 == 0):
#         n = num // 3
#         result=n+m
#         break
#     else :
#         m -= 1
# print(result)

