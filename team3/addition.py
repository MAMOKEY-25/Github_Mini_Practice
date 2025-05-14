Python 3.13.3 (tags/v3.13.3:6280bb5, Apr  8 2025, 14:47:33) [MSC v.1943 64 bit (AMD64)] on win32
Enter "help" below or click "Help" above for more information.
>>> class Addition:
...     def add(self, a, b):
...         try:
...             return a + b
...         except TypeError:
...             return "숫자만 입력하세요."
