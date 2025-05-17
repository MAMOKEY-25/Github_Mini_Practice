//곱셈 기능 담당 클래스
public class Mul {
    public static double multiply(int num1, int num2) {    //실수형 매개변수 2개 받는 매서드 static으로 선언
        return num1 * num2;                      //  num1과 num2를 곱한 값 반환
    }
}

/*사용 예시
public class Main() {
    public static void main(String[] args) {
           double result = Mul.multiply(4, 5);      //두 개의 매개변수를 받아 곱셈 결과를 result 변수에 저장
           System.out.print("result = " +result);   //결과값 출력
 */