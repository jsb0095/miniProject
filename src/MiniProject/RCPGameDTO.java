package MiniProject;

public class RCPGameDTO {
	Long id;
	int coin;
	String gamename;
	int score;
	int win;
	int lose;
	public RCPGameDTO(Long id, int coin, String gamename,  int score,int win,int lose) {
		
		this.id = id;
		this.coin = coin;
		this.gamename = gamename;
		this.score = score;
		this.win = win;
		this.lose = lose;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getCoin() {
		return coin;
	}
	public void setCoin(int coin) {
		this.coin = coin;
	}
	public String getGamename() {
		return gamename;
	}
	public void setGamename(String gamename) {
		this.gamename = gamename;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
		
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	@Override
	public String toString() {
		return "[회원번호=" + id + ", 보유코인=" + coin + ", 유저명=" + gamename + ", 점수=" + score + ", 승리횟수="
				+ win + ", 패배횟수=" + lose + "]";
	}
	
	
}
