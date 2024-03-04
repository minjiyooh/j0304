package t1_memory;

import java.util.Scanner;

public class Test1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int ans = 0; //1. 계속, 0:그만
 		int cnt = 0;
 		String ans = "N";
		
 		while(true) {
 			cnt++;
 			System.out.println(cnt);
 			System.out.print("작업을 계속 할까요? Y:계속, N:그만");
 			ans = sc.next();
 			if(ans.equals("N")) break; //ans 는 n이 아니기때문에 결과값이 같지 않음. 
 			                      //그래서 계속 입력받음. string은 참조타입이라
 			
 		}
 		
 		System.out.println("작업끝....");
 		
 		sc.close();
	}
}
