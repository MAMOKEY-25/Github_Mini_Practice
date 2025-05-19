class Multiplication:
    def multiply(self, a, b):
        if not (isinstance(a, (int, float)) and isinstance(b, (int, float))):
            # 문자열을 넣을 경우 숫자만 입력하라는 메세지 반환
            return "숫자만 입력하세요."
        return a * b    # 정수형과 실수형인 a와 b를 곱해서 반환 
