# 8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
## 제한 시간이 1초인 만큼 라이브러리 사용 필수!

# n=input()
# result=''
# for i in n:
#     num=int(i)
#     temp=''
#     for j in range(3):
#         temp+=str(num%2)
#         num//=2
#     result+=temp[::-1]
# print(int(result))

print(bin(int(input(), 8))[2:])

#bin : 2진수로 변환
# int(value,base)//base : value의 현재 진수
# [2:] //2진법을 뜻하는 0b가 붙어서 출력