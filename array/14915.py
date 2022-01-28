# 정수 m, n을 입력 받아, 10진수 m을 n진수로 바꾸어 출력하는 프로그램을 작성하시오. (0 ≤ m ≤ 1,000,000, 2 ≤ n ≤ 16)
m,n=map(int, input().split())
arr='0123456789ABCDEF'
result=''
while True:
    result+=arr[m%n]
    m//=n
    if(m<=0):break
print(result[::-1])