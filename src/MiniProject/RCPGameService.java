package MiniProject;



import java.util.Scanner;

public class RCPGameService {

	RCPGameRepository rcpRepository = new RCPGameRepository();
	Scanner src = new Scanner(System.in);
	static Long id = 0L;
	int coin = 5;
	int user = 0;
	int i = 0;
	int win = 0;
	int lose = 0;
	int score = 0;
	boolean run = true;

	
	public void save() {
		
		System.out.println("닉네임을 입력해주세요");
		String gamename = src.next();
		System.out.println();
		
		rcpRepository.save(++id, coin, gamename, score, win, lose);
		

	}

	public void game() {

		System.out.println("회원번호를 입력하세여");
		long id = src.nextLong();
		boolean result = rcpRepository.userCheak(id);
		if (result == true) {
			System.out.println("로그인성공!!!!!!!!");
			System.out.println(RCPGameRepository.rcpList.get(i).getId());
			int coinEnd=0;
			while (true) {
				System.out.println();
				System.out.println();
				System.out.println(" ───────────────────       ");
				System.out.println("│  추 억 의 짱 깬 뽀    │      ");
				System.out.println(" ───────────────────        ");
				System.out.println("|                  |        ");
				System.out.println("|   ✌️    ✊    ✋🏼 |       ");
				System.out.println("|__________________|         ");
				System.out.println("|                  \\       ");
				System.out.println("|\\    ○    ○    ○   \\      ");
				System.out.println("| \\__________________\\       ");
				System.out.println("| |               _  |       ");
				System.out.println("| |   |          |_| |    ");
				System.out.println("|_|__________________|     ");
				System.out.println();
				System.out.println("        computer ");
				System.out.println();
				System.out.println("           VS");
				System.out.println();
				System.out.println("user:[1]✌️가위 [2]✊바위 [3]✋보[4]뒤로가기");
				user = src.nextInt();
				coinEnd=rcpRepository.gameResult(id, coin, user, "0", 0, 0);
				System.out.println(coinEnd);
			if(user==4) 
			{
				System.out.println("뒤로가기");
				break;
			}
			if(coinEnd==0) {
				System.out.println("게임패배");
				System.exit(0);
			}
			
			}

		} else {
			System.out.println("존재하지않는 닉네임입니다.");
		}
	}

	

	public void store() {
		int choice = 0;

		System.out.println("회원번호를 입력하세요");
		long id = src.nextLong();
		boolean result = rcpRepository.userCheak(id);
		if (result == true) {
			System.out.println("로그인성공!!!!!!!!");
			System.out.println("[1] 50🪙 :초심자의행운");
			System.out.println("[2] 100🪙 :동네좀노는형");
			System.out.println("[3] 200🪙 :신내린잼민이");
			System.out.println("[4] 300🪙 :코인전문가");
			System.out.println("[5] 500🪙 :문방구사장아들");
			System.out.println("[6] 뒤로가기");
			System.out.println("구입하실 아이템의 번호를 입력해주세요");
			choice = src.nextInt();
			switch (choice) {

			case 1:
				RCPGameRepository.store(choice,id);
				break;

			case 2:
				RCPGameRepository.store(choice, id);
				;
				break;

			case 3:

				RCPGameRepository.store(choice, id);
				break;

			case 4:

				RCPGameRepository.store(choice, id);
				break;

			case 5:

				RCPGameRepository.store(choice, id);
				break;
			case 6:

				System.out.println("뒤로가기");
				break;

			default:
				System.out.println("1~6사이의 숫자를 입력해주세요");
				break;
			}
		} else {
			System.out.println("존재하지 않는 아이디입니다");
		}
	}

	public void userlog() {
		System.out.println("회원번호를 입력하세여");
		long id = src.nextLong();
		rcpRepository.userCheak(id);
		

	}
}