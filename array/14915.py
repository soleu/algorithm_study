m,n=map(int, input().split())
arr='0123456789ABCDEF'
result=''
while True:
    result+=arr[m%n]
    m//=n
    if(m<=0):break
print(result[::-1])