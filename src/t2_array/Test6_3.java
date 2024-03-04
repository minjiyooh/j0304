package t2_array;

import java.util.Date;
import java.util.Scanner;

public class Test6_3 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("now : " + now);
		
		Scanner sc = new Scanner(System.in);
		String yn = "";
		
		System.out.print("계속 할까요?(Yes/No) ");
		yn = sc.next();
		System.out.println("입력된 문자 : " + yn);
		
		for(int i=0; i<yn.length(); i++) {//정수타입이라 == 만약에 string이면 equals
			// == 는 주소나 값을 비교
			if(yn.charAt(i) == 'Y') System.out.println("입력된 문자중 Y가 있습니다.");
			else  System.out.println("입력된 문자중 Y가 없어요~~~~");
		}
		
		sc.close();
	}
}
