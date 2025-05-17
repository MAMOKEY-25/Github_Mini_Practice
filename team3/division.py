class Division:
    def divide(self, a, b):
        try: # 정상적인 결과일 때 a/b 반환 
            return a / b
        except ZeroDivisionError: # b가 0일때 
            return "0으로는 나눌 수 없습니다."
        except TypeError: # 매개변수 타입이 다를때 
            return "숫자만 입력하세요."
