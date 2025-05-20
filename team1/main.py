# 모듈 호출
import addmodule 
import subtraction
import multiplication
import div

#연산지 고르기
def main():

    print("간단한 계산기")
    print("1: 덧셈")
    print("2: 뺄셈")
    print("3: 곱셈")
    print("4: 나눗셈")
#변수 입력받기
    choice = input("원하는 연산을 선택하세요 (1/2/3/4): ")
    a = float(input("첫 번째 숫자를 입력하세요: "))
    b = float(input("두 번째 숫자를 입력하세요: "))

#번호에 따른 연산 클래스 불러오기
    if choice == '1':          
        calc = addmodule.Adder() 
        result = calc.add(a,b)
        print(result)             #덧셈
    
    if choice == '2':          
        calc = subtraction.Subtractor() 
        result = calc.subtract(a,b)
        print(result)

    elif choice == '3':
        calc = multiplication.Mul()
        result = calc.mul(a,b)
        print(result)             #곱셈

    elif choice == '4':
        calc = div.Divide()
        result = calc.div(a,b)
        print(result) 
    
    else:
        print("잘못된 선택입니다.")
        return

if __name__ == "__main__":
    main()
