from addition import Addition # 더하기 클래스 추가
from subtraction import Subtraction # 빼기 클래스 추가
from multiplication import Multiplication # 곱하기 클래스 추가
from division import Division # 나누기 클래스 추가

def main():
    a = 10  # a, b 변수 생성
    b = 5

    # 더하기, 빼기, 곱하기, 나누기 객체 생성
    adder = Addition()
    subtractor = Subtraction()
    multiplier = Multiplication()
    divider = Division()

    # 더하기, 빼기, 곱하기, 나누기 출력
    print("더하기:", adder.add(a, b))
    print("빼기:", subtractor.subtract(a, b))
    print("곱하기:", multiplier.multiply(a, b))
    print("나누기:", divider.divide(a, b))

# 메인함수 호출
if __name__ == "__main__":
    main()
