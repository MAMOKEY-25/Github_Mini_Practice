
while True:
    num1 = int(input("수를 입력하세요:"))
    op = input("연산자를 입력하세요:")
    num2 = int(input("수를 입력하세요:"))
    result = num1 / num2
    if op == "/":
        if num2 == 0:
            print("0으로 나눌 수 없습니다.")
            continue
        else:
            print(f"{num1}/{num2}={result}")
            break
    else:
        print("연산자를 다시 입력해 주세요")


