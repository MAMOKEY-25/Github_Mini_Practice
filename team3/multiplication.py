import numbers

class Multiplication:
    def multiply(self, a, b):
        # numbers.Number: int, float 등 숫자 타입을 포괄
        if not isinstance(a, numbers.Number) or not isinstance(b, numbers.Number):
            return "숫자만 입력하세요."
        
        result = a * b
        
        # float 결과에 대해 소수점 오차 제거 (소수점 10자리까지 반올림)
        if isinstance(result, float):
            return round(result, 10)
        return result