package MiniProject;

import java.util.ArrayList;
import java.util.List;

public class RCPGameRepository {
	static List<RCPGameDTO> rcpList = new ArrayList<>();

	public RCPGameDTO save(Long id, int coin, String gamename, int score, int win, int lose) {

		RCPGameDTO rcpDto = new RCPGameDTO(id, coin, gamename, score, win, lose);

		rcpList.add(rcpDto);
		System.out.println(rcpDto);

		return rcpDto;
	}

	public int gameResult(Long id, int coin, int user, String score, int win, int lose) {
		int i=0;
		int win1 = (int) (Math.random() * 24) + 1;
		int computer = (int) (Math.random() * 3) + 1;
		
		int coinEnd=0;
		
		if (user == 1) {
				System.out.println("user:✌️가위");
			} else if (user == 2) {
				System.out.println("user:✊바위");
			} else if (user == 3) {
				System.out.println("user:✋🏼보");
			} else {
				return user;
			}
			if (computer == 1) {
				System.out.println("computer:✌️가위");
	
			} else if (computer == 2) {
				System.out.println("computer:✊바위");
			} else if (computer == 3) {
				System.out.println("computer:✋🏼보");
			}
			
		

			if (computer - user == -2 || computer - user == 1) {
	
				System.out.println("　　　　　\r\n" + "　computerWin| ノ　 ㅡ　|\r\n" + "　　개못해!!　　　|　●　●　 |\r\n"
						+ "　　　　　　　　　|　 （　　 |\r\n" + "　　　　　　　　　　   -　　人\r\n" + "　　　　　　　 　　 ＞―-― ´　 ￣￣＼\r\n"
						+ "⊂ニニ￣￣￣ ╲　　 /　 　　　　　　　|\r\n" + "　　くメ）_ノ |　 |　　|　　　　　 |　 |\r\n" + "　　　　(／|　 |　/　　|　　　　　 |　 |\r\n"
						+ "　　　　 　 |　 |/　　/|　　　　　 |　 |\r\n" + "　　 　　　 |　　ﾄ　 / |　　　　　 |　 |\r\n" + "　　　　　　╲＿_／　|　　　　　 |　 |\r\n"
						+ "\r\n");
	
				coinEnd=computerWin(coin, id, lose);
				
	
			} else if (computer - user == -1 || computer - user == 2) {
	
				coinEnd=userWin(win1, id, score, win);
				System.out.println("당첨🪙:" + win1);
				System.out.println(
						" ∧＿∧  　   userWin!!   —̳͟͞͞🪙            —̳͟͞͞🪙\r\n" + "(•︠‿•︡)つ  —̳͟͞͞🪙          —̳͟͞͞🪙\r\n"
								+ "(つ　 <  \r\n" + "｜　 _つ                                         \r\n" + "`し´");
				
	
			} else if (computer - user == 0) {
				System.out.println("draw");
				coinEnd=resultdraw(id,coin);
			}
			
			
			return coinEnd;
		
	}

	private int resultdraw(Long id,int coin) {
		int i=0;
		int coinEnd = 0;
		
		for ( i = 0; i < rcpList.size(); i++) {
			if (id.equals(rcpList.get(i).getId())) {
				
				System.out.println("보유🪙:" + rcpList.get(i).getCoin());
				 coinEnd=rcpList.get(i).getCoin();
			}
			}
			return coinEnd;
	}

	public boolean userCheak(Long id) {
		boolean run = false;
		for (int i = 0; i < rcpList.size(); i++) {
			if (id.equals(rcpList.get(i).getId())) {
				System.out.println(RCPGameRepository.rcpList.get(i));
				run = true;
			} else {

			}
		}
		return run;

	}

	public int userWin(int win1, Long id, String Score, int win) {
		int i=0;
		int coinEnd=0;
		for ( i = 0; i < rcpList.size(); i++) {
			if (id.equals(rcpList.get(i).getId())) {
				rcpList.get(i).setCoin(rcpList.get(i).getCoin() + win1);
				rcpList.get(i).setScore(rcpList.get(i).getScore() + win1);
				rcpList.get(i).setWin(rcpList.get(i).getWin() + 1);
				System.out.println("보유🪙:" + rcpList.get(i).getCoin());
				 coinEnd=rcpList.get(i).getCoin();
			}

		}
		return coinEnd;
	}

	public int computerWin(int coin, Long id, int lose) {
		int i=0;
		int coinEnd=0;
		for (i = 0; i < rcpList.size(); i++) {
			if (id.equals(rcpList.get(i).getId())) {
				rcpList.get(i).setCoin(rcpList.get(i).getCoin() - 1);
				rcpList.get(i).setScore(rcpList.get(i).getScore() - 1);
				rcpList.get(i).setLose(rcpList.get(i).getLose() + 1);
				System.out.println("보유🪙:" + rcpList.get(i).getCoin());
				 coinEnd=rcpList.get(i).getCoin();
			}
		}
		
		return coinEnd;
	}

	public static void store(int choice, Long id) {
		String luck = "<초심자의행운>";
		String brother = "<동네좀노는형>";
		String spirit = "<신내린잼민이>";
		String master = "<코인전문가>";
		String rich = "<문방구사장아들>";

		for (int i = 0; i < rcpList.size(); i++) {

			if (id.equals(rcpList.get(i).getId()))
				if (choice == 1 && rcpList.get(i).getCoin() >= 50) {
					rcpList.get(i).setGamename(luck + rcpList.get(i).getGamename());
					rcpList.get(i).setCoin(rcpList.get(i).getCoin() - 50);
					System.out.println("닉네임"+rcpList.get(i).gamename);
					System.out.println("보유🪙"+rcpList.get(i).getCoin()+"개");

				} else if (choice == 2 && rcpList.get(i).getCoin() >= 100) {
					rcpList.get(i).setGamename(brother + rcpList.get(i).getGamename());
					rcpList.get(i).setCoin(rcpList.get(i).getCoin() - 100);
					System.out.println("닉네임"+rcpList.get(i).gamename);
					System.out.println("보유🪙"+rcpList.get(i).getCoin()+"개");
				} else if (choice == 3 && rcpList.get(i).getCoin() >= 200) {
					rcpList.get(i).setGamename(spirit + rcpList.get(i).getGamename());
					rcpList.get(i).setCoin(rcpList.get(i).getCoin() - 200);
					System.out.println("닉네임"+rcpList.get(i).gamename);
					System.out.println("보유🪙"+rcpList.get(i).getCoin()+"개");
				} else if (choice == 4 && rcpList.get(i).getCoin() >= 300) {
					rcpList.get(i).setGamename(master + rcpList.get(i).getGamename());
					rcpList.get(i).setCoin(rcpList.get(i).getCoin() - 300);
					System.out.println("닉네임"+rcpList.get(i).gamename);
					System.out.println("보유🪙"+rcpList.get(i).getCoin()+"개");
				} else if (choice == 5 && rcpList.get(i).getCoin() >= 500) {
					rcpList.get(i).setGamename(rich + rcpList.get(i).getGamename());
					rcpList.get(i).setCoin(rcpList.get(i).getCoin() - 500);
					System.out.println("닉네임"+rcpList.get(i).gamename);
					System.out.println("보유🪙"+rcpList.get(i).getCoin()+"개");
				}

		}
	}

}
