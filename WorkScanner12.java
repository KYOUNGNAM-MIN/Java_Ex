package WorkExample;

import java.util.Scanner;

public class WorkScanner12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산>>");
		double a = sc.nextDouble();
		String op = sc.next();
		double b = sc.nextDouble();
		double result = 0;
		
		/*switch(op) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
			if(b==0) System.out.print("0으로 나눌 수 없습니다.");
			else result = a / b;
			break;
		}*/
		
		if(op.equals("+"))
			result = a + b;
		else if(op.equals("-"))
			result = a - b;
		else if(op.equals("*"))
			result = a * b;
		else if(op.equals("/")) {
			if(b == 0){
				System.out.print("0으로 나눌 수 없습니다.");
				sc.close();
				return;
			}
			else
				result = a / b;
		}
		
		System.out.print(a + op + b + "의 계산 결과는 " + result);
		sc.close();
	}

}
