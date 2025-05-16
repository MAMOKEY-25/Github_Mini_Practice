Python 3.13.3 (tags/v3.13.3:6280bb5, Apr  8 2025, 14:47:33) [MSC v.1943 64 bit (AMD64)] on win32
Enter "help" below or click "Help" above for more information.
>>> class Addition: #Addition 클래스는 두 숫자를 더하는 기능을 제공합니다.
...     def add(self, a, b): #add(a, b): 두 숫자를 더한 값을 반환합니다.
...         try:  # a와 b를 더해서 결과를 반환
...             return a + b
...         except TypeError:  # a 또는 b가 숫자가 아닌 타입일 때 예외 처리
...             return "숫자만 입력하세요."
