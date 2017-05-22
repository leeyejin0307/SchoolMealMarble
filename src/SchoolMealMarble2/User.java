package SchoolMealMarble2;

interface UserInterface{
	//int location; = 사용자 위치 변수
	int User(String name); 
	//int Money;		사용자 현재 가지고 있는 금액
	//int totalMoney; 사용자 토탈 금액 변수
	//int POKETMONET=200000; 시작점 돌때 월급
	void forSale(int n);// user의 이름과 같은 건물 출력, n = 통행료 /
	// 통행료보다 크거나 같으면 매각 완료.
	// 현재 user가 가진 금액 += 매각한 건물들의 건설비
	void backruptcy();//파산
	void move();
	void Steal();//도착한 지역에 상대방이 먼저 있을 경우 상대방이 나의 돈을 갈취함
}
public class User {
	
}

