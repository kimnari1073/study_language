print('hello world!')
print(1.1)
print(type(1.1))

# 한 번에 여러 자료 출력
print(1,2,-5,3.14,2.71828)
print('Hi','Python')
print('230000원은','5000원 ?개','1000원 ?개')
print('5000원',23000//5000,"개")
print('1000원',(23000%5000)//1000,'개')
# eval() function
print(eval('3+15/2'))
print(eval('1+62-3*52'))
print(1+62-3*52)
print(eval('256*553-152'))
print(256*553-152)
print(162353290930%539253+162353290930/539253)
print(eval('162353290930%539253+162353290930/539253'))

print('78000원인데 어떻게 계산하실래요?')
price = 78000
print('5만원 짜리: ',price//50000,"개") 
price %= 50000
print("남은 지불 금액: ",price)
print('만원 짜리: ',price//10000,"개")
price %= 10000
print("남은 지불 금액: ",price)

print('5천원 짜리: ',price//5000,"개")
price %=5000
print("남은 지불 금액: ",price)
print("5천원 짜리를 한장 더 냈습니다. 거스름돈: ",5000%price)