from addition import Addition
from subtraction import Subtraction
from multiplication import Multiplication
from division import Division

def main():
    a = 10
    b = 5

    adder = Addition()
    subtractor = Subtraction()
    multiplier = Multiplication()
    divider = Division()

    print("더하기:", adder.add(a, b))
    print("빼기:", subtractor.subtract(a, b))
    print("곱하기:", multiplier.multiply(a, b))
    print("나누기:", divider.divide(a, b))

if __name__ == "__main__":
    main()
