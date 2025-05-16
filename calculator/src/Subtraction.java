// 전서윤 - 빼기 모듈 구현

// 같은 패키지지만 public으로 다른곳에서도 import 사용 없이 가능해용
public class Subtraction {
    // static 메서드로 선언하여 객체 생성 없이 전역함수로 구현했습니다.
    public static double subtract(double a, double b) {
        return a - b;
    }
}

// ========== 사용법 ===========

/*
직접 호출로 사용하시면 돼용!
Subtraction.subtract(3, 1)

EX) 예시 메인 코드입니다.
public class Main() {
    public static void main(String[] args) {
        double result = Subtraction.subtract(10, 4);
        System.out.println("결과: " + result);
    }
}
*/
