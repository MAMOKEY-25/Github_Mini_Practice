import java.util.Scanner;

public class CalculatorModule {
    double num1 , num2;                  // 실수형 변수 num1 , num2 선언
    double result , recentValue = 0;     // 실수형 결과 값 0으로 선언과 동시에 초기화
    String operator;                     // 연산자 문자열로 선언
    Scanner sc = new Scanner(System.in); // 입력값을 위한 스캐너 객체 생성

    // 해당 문자열이 숫자인걸 판별해주는 메서드
    boolean isNumber(String str) {       // Boolean 타입으로 반환해주는 문자열이 실수인지 판별해주는 메서드
        if (str == null || str.isEmpty()){
            return false;
        }
        try {
            Double.parseDouble(str);     // 매개변수 str 을 실수형으로 변환하려할때 그냥 변환이 된다면 참을 반환해주고 변환이 되지않아 오류를 발생하면 아래 catch 문으로 넘어간다.
            return true;
        }catch (NumberFormatException e){ // 여기서 반환이 되지않을때 에러를 다루는데 실수형으로 반환이 되지않는다는건 문자라는걸 의미 고로 거짓을 반환한다.
            return false;
        }
    }

    // Boolean 타입으로 반환해주는 연산자가 [ + , - , * , / ] 에 해당이 되고 비어있지 않는지 판별해주는 메서드
    boolean isOperator(String str) {
        return str != null && (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/"));
    }

    // 위 선언한 변수들에 값을 매개변수를 받아 설정해주는 메서드
    void setOperands(double num1 ,String operator ,double num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    /*
     * [ 연산 프로그램 메서드 ]
     * 3개의 매개변수 값을 받아 switch문에 부호 값에 따라 알맞는 사칙연산 메서드가 호출되어 연산을 해준다.
     * */
    void operatorProgram(double num1 , String operator , double num2) {
        switch (operator) {
            case "+":
                this.result = Addition.add(num1 , num2);                // CalculatorModule 필드 값 result 에 연산 수행 값을 저장한다.
                this.recentValue = Addition.add(this.num1 , this.num2); // CalculatorModule 필드 값 recentValue 은 연산한 값을 나중에도 사용하기 위한 필드이다
                System.out.println("결과 값 : " + result + "\n");
                result = 0;                                             // result 는 출력 후 0으로 설정된다.
                break;                                                  // switch 문 종료
                                                                        // 나머지 3개는 위 코드와 비슷한 기능을 수행합니다
            case "-":
                this.result = Subtraction.subtract(num1 , num2);
                this.recentValue = Subtraction.subtract(this.num1 , this.num2);
                System.out.println("결과 값 : " + result + "\n");
                result = 0;
                break;
            case "*":
                this.result = Multiplication.multiply(num1 , num2);
                this.recentValue = Multiplication.multiply(this.num1 , this.num2);
                System.out.println("결과 값 : " + result + "\n");
                result = 0;
                break;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }else {
                    this.result = Division.divide(num1, num2);
                    this.recentValue = Division.divide(this.num1, this.num2);
                    System.out.println("결과 값 : " + result + "\n");
                    result = 0;
                    break;
                }
            default:
                throw new IllegalArgumentException("지원하지 않는 연산자입니다");   // 4가지 사칙연산에 해당이 되지않을 경우에 에러를 발생시킨다. 이 에러는 후에 try catch 문으로 처리하게 된다
        }
    }

    void startCalculator() {
        while (true){
            System.out.print("\n수를 입력해주세요 > ");
            String num1 = sc.nextLine();                     // 변수 num1 값에 문자열로 입력받는다.
            if(num1.equalsIgnoreCase("Q")) {     // 입력받은 num1 값이 Q(q) 일 경우에 break 문으로 계산기가 종료되게 된다.
                System.out.println("계산기가 종료되었습니다.");
                break;
            }else if(!isNumber(num1)){                       // isNumber() 메서드가 false를 반환하게 되면 ! 연산자로 변환하여 숫자를 입력하라고 한다.
                System.out.println("숫자를 입력해주세요");
                continue;
            }

            String operator;                                        // operator 변수를 미리 초기화 해논다.
            while (true){
                System.out.print("\n연산자를 입력하세요 > ");
                operator = sc.nextLine();                           // 초기화 되어있는 변수에 값을 입력받는다.
                if(operator.equalsIgnoreCase("Q")) {    // 만일 Q를 입력하게 될 경우 계산기는 종료된다.
                    System.out.println("계산기가 종료되었습니다.");
                    return;                                         // return; 으로 startCalculator() 메서드는 종료되게 된다.
                }else if (!isOperator(operator)) {                  // isOperator() 메서드가 false 반환하게 되면 ! 연산자로 변환하여 제대로 된 연산자를 입력하라고 한다.
                    System.out.println("제대로 된 연산자를 입력해주세요");
                    continue;                                       // 95줄 반복문부터 시작한다.
                }
                break;                                              // 제대로 된 연산자를 입력하게 되면 operator 변수에 연산자 값이 저장되고 반복문은 종료된다.
            }

            String num2;                                        // num2 변수를 미리 초기화 해논다.
            while (true){
                System.out.print("\n수를 입력해주세요 > ");
                num2 = sc.nextLine();                           // 초기화 되어있는 변수에 값을 입력받는다.
                if(num2.equalsIgnoreCase("Q")) {    // 만일 Q를 입력하게 될 경우 계산기는 종료된다.
                    System.out.print("계산기가 종료되었습니다");
                    return;                                     // return; 으로 startCalculator() 메서드는 종료되게 된다.
                }else if (!isNumber(num2)){                     // isOperator() 메서드가 false 반환하게 되면 ! 연산자로 변환하여 제대로 된 연산자를 입력하라고 한다.
                    System.out.print("숫자를 입력해주세요");
                    continue;                                   // 109줄 반복문부터 시작한다.
                }
                break;                                          // 제대로 된 숫자를 입력하게 되면 num2 변수에 값이 저장되고 반복문은 종료된다.
            }

            double parsedNum1 = Double.parseDouble(num1); // 기존에 String 타입으로 되어있는 num1 값을 double 타입으로 변환한다.
            double parsedNum2 = Double.parseDouble(num2); // 기존에 String 타입으로 되어있는 num2 값을 double 타입으로 변환한다.

            setOperands(parsedNum1 , operator , parsedNum2); // setOperands() 메서드에 값1 , 연산자 , 값2를 전달한다.

            try{
                operatorProgram(parsedNum1 , operator , parsedNum2); // 연산을 해주는 operatorProgram() 메서드에 매개변수를 채워 호출하고 그에 대한 연산값을 받는다.
                processRecentValue();                                // startCalculator() 메서드로 연산된 값 즉, 이전 값으로 연산을 하게 해주는 메서드이다.
            }
            catch(ArithmeticException e){                            // 나눗셈시 0으로 나누려 했을 때 발생하는 오류를 catch 한 후 처리한다.
                System.out.println("0으로 나눌 수 없습니다");
                continue;                                            // 계산기 초기상태로 돌아가게 된다.
            }
        }
    }

    void processRecentValue() {
        System.out.print("최근 값("+ this.recentValue +")으로 연산하시겠습니까? [ Y / N / Q ] > ");
        while (true) {
            String recent = sc.nextLine();          // 이전의 값으로 연산을 할건지에 대한 답을 받는다.

            if (recent.equalsIgnoreCase("Y")) { // Y 일시 밑에 로직이 실행된다.
                num1 = this.recentValue;                   // num1은 startCalculator() 에서 연산한 값을 부여한다. ( recentValue는 operatorProgram 에서 사용한다 )

                String operator;                           // 위와 동일한 코드
                while (true){
                    System.out.print("\n연산자를 입력하세요 > ");
                    operator = sc.nextLine();
                    if(operator.equalsIgnoreCase("Q")) {
                        System.out.println("계산기가 종료되었습니다.");
                        System.exit(0); // 프로그램 전체 종료
                        return;
                    }else if (!isOperator(operator)) {
                        System.out.println("제대로 된 연산자를 입력해주세요");
                        continue;
                    }
                    break;
                }

                String num2;                               // 위와 동일한 코드
                while (true){
                    System.out.print("\n수를 입력해주세요 > ");
                    num2 = sc.nextLine();
                    if(num2.equalsIgnoreCase("Q")) {
                        System.out.print("계산기가 종료되었습니다");
                        System.exit(0); // 프로그램 전체 종료
                        return;
                    }else if (!isNumber(num2)){
                        System.out.print("숫자를 입력해주세요");
                        continue;
                    }
                    break;
                }

                double parsedNum2 = Double.parseDouble(num2);   // 실수형으로 문자열 num2 를 변환해준다

                setOperands(num1 , operator , parsedNum2);      // num1은 double 형이기 때문에 바로 형변환을 하지않는다
                try{
                    operatorProgram(num1 , operator , parsedNum2);
                } catch (ArithmeticException e){
                    System.out.println("0으로 나눌 수 없습니다");
                    return;
                }
                return;
            } else if (recent.equalsIgnoreCase("N")) {
                return;                                         // N 일경우에 return; 으로 이 메서드를 종료한다.
            } else if (recent.equalsIgnoreCase("Q")) {
                System.out.println("계산기가 종료되었습니다.");
                System.exit(0);                           // JVM을 강제 종료시킨다. ( 계산기 종료 )
                return;
            } else {
                System.out.println("잘못된 입력입니다. Y, N 또는 Q를 입력해주세요.");
            }
        }
    }
}
