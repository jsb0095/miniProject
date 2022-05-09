TItle: 추억의 짱깬뽀


코인기능:코인소모 코인획득 코인적립 
가위바위보 기능: 게임승리 코인획득 게임무승부  게임패배 게임종료 코인소모
상점기능:칭호아이템구매 코인소모   
50coin= 초심자의 행운
100coin= 동네 좀 노는형
200coin= 신내린 잼민이
1000coin=코인 전문가 
10000coin=문방구 아들
정보기능: 이긴횟수 패배횟수 점수 조회기능

변수 
변수: 코인획득(coinSum), 코인소모(coinSub),코인적립(coinSave),
가위(scissors),바위(rook),보(paper) ,게임승리(gameWin), 게임무승부(gameDrow),게임패배(gameLose) 한번더게임(reGame),상점(store) 아이템(item)
점수(score) 점수합산(totalScore) 
50coin(luck)"초심자의 행운"
100coin(brother) "동네 좀 노는형"
200coin(spirit) "신내린 잼민이"
1000coin(master)"코인 전문가" 
10000coin(rich)"문방구 아들"
클래스
rcpGameMain(가위바위보게임)
게임을 시작하기전에 닉넥임을 입력받는다  체크후 아이디가 존재하면 게임실행
게임결과가 컴퓨터win 코인-1 게임결과가 userwin이면 randomcoin에서 1~24 랜덤 매서드 사용해서
랜덤값 받고 닉넥임 코인에 값 저장 

