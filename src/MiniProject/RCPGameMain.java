package MiniProject;

import java.util.Scanner;

public class RCPGameMain {

	public static void main(String[] args) {
		int choice=0;
		boolean run=true;
		Scanner src=new Scanner(System.in);
		RCPGameService rcpService=new RCPGameService();
		
		while(run) {										
		
			System.out.println("추억의 가위바위보 게임 ");
			System.out.println("( •_•) (•_• )\r\n"
					+ "( ง )✊ ✋( ୧ )\r\n"
					+ "/︶\\ 	/︶\\");
		 System.out.println("┌────────────────────────────────────────────────────┐");
		 System.out.println("| 1.간편 회원가입 │ 2.게임하기 │ 3.상점 │ 4.정보조회 │ 5.로그아웃 | ");
		 System.out.println("└────────────────────────────────────────────────────┘");
		 
		
		 System.out.print("선택:");
		 choice=src.nextInt();
			if(choice==1) 
			{
				rcpService.save();
			}else if(choice==2) 
			{
				rcpService.game();
			}else if(choice==3) 
			{
				rcpService.store();
			}else if(choice==4) 
			{
				rcpService.userlog();
			}else if(choice==5) 
			{
				System.out.println("종료");
				run=false;
			}
		}
	}

}
