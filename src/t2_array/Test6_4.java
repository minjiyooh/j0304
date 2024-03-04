package t2_array;

import java.util.Date;
import java.util.Scanner;

//임포트 = ctrl + shit + o
public class Test6_4 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("now :" +now);
		
		Scanner sc = new Scanner(System.in);
		String yn = ""; //널
		
		System.out.print("계속 할까요? (Yes/No)");
		yn = sc.next();
		System.out.print("입력된 문자 : " + yn);
		
		for(int i = 0; i <yn.length(); i ++ ) {
			if(yn.equals("Y")) System.out.println("입력된 문자는 Y 입니다.");  
		 else System.out.println("입력된 문자는 Y가 아닙니다.");
		
	}
			
		sc.close();
	}
}
