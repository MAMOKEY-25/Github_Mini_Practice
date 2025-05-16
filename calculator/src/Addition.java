// 덧셈 기능 담당 클래스
public class Addition {
    public static double add(double a, double b) {  // 실수형 매개변수 2개를 받는 메서드 static으로 선언
        return a + b;   // 2개의 매개변수의 덧셈 결과 반환
    }
}

/* 사용법 예시
public class Main() {
    public static void main(String[] args) {
        double result = Addition.add(2, 4);         // 두 개의 매개변수를 받아 덧셈값을 result 변수에 저장
        System.out.println("result = " + result);
    }
}
*/
