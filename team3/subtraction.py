class Subtraction:
    def subtract(self, a, b):
        try:
            return a - b # 숫자끼리 뺄셈 수행
        except TypeError:
            return "숫자만 입력하세요" # 숫자가 아닌 값이 입력되면 예외처리