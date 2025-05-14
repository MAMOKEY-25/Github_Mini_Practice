# division.py

class Division:
    def divide(self, a, b):
        try:
            return a / b
        except ZeroDivisionError:
            return "0으로는 나눌 수 없습니다."
        except TypeError:
            return "숫자만 입력하세요."
