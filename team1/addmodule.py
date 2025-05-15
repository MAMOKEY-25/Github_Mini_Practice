class Adder:
    def add(self, a, b):
        return a + b

a = int(input("숫자 입력 a: "))
b = int(input("숫자 입력 b: "))

adder = Adder()
result = adder.add(a, b)
print("결과:", result)