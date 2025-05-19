public class Main {
    public static void main(String[] args) {
        System.out.println("프로그램 종료하려면 [ Q ] 을 입력하세요");
        CalculatorModule calculator = new CalculatorModule(); // calculator 객체 생성
        calculator.startCalculator();                         // 계산기 실행
    }
}