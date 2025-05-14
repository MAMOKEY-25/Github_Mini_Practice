class Subtraction:
    def subtract(self, a, b):
        try:
            return a - b
        except TypeError:
            return "숫자만 입력하세요"
        
        