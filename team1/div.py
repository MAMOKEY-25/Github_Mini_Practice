class divide:
    def div(self, num1, num2):
        try: #예외처리
            return num1 / num2
        except ZeroDivisionError: #0이 들어오면 오류메세지를 출력하고 None 을 리턴함함
            print("0으로 나눌 수 없습니다:다시 입력해 주세요")
            return None
        except TypeError: # 숫자가 아닌 다른 타입이 들어오면 오류 메세지를 출려갛고  None 을 리턴함
            print("숫자를 입력해 주세요")
            return None