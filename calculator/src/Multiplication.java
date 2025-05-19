//곱셈 기능 담당 클래스
public class Multiplication {
    public static double multiply(double num1, double num2) {    //실수형 매개변수 2개 받는 매서드 static으로 선언
        return num1 * num2;                                //  num1과 num2를 곱한 값 반환
    }
}

/*사용 예시
public class Main {
    public static void main(String[] args) {
        double result = Multiplication.multiply(4, 5);      // 두 수의 곱셈 결과 result변수에 저장
        System.out.print("result = " + result);             // 결과 출력
    }
}
*/