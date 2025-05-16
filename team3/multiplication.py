class Multiplication:
    # 두 수의 곱셈을 수행하는 메서드 정의
    def multiply(self, a, b):
        try:
            # a와 b를 곱한 결과를 반환
            return a * b
        except TypeError:
            # a나 b가 숫자가 아닌 경우 예외 처리
            # 사용자에게 숫자만 입력해야 한다는 메세지를 반환
            return "숫자만 입력하세요."
