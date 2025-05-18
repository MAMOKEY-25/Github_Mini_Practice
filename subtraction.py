class Subtractor:
    def subtract(self, a: int, b: int) -> int:
        return a - b

if __name__ == "__main__":
    a = int(input("첫 번째 숫자: "))
    b = int(input("두 번째 숫자: "))
    
    s = Subtractor()
    result = s.subtract(a, b)
    print("결과:", result)

