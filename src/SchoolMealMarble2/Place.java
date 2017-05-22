package SchoolMealMarble2;

interface PlaceInterface extends Board{
	void School(String name,int build);//지역(학교)객체를 생성할 때 이름과 매매가를 입력
	void Place(String name);//지역의 이름(특수블럭)
	void Owner(String owner);//땅의 주인
	int setPay();//통행료지불 매매가*2
	void build();//컴퓨터일시, user일시 다르게 메소드가 실행되야함 / 지역(학교) 살지 안살지
}
public class Place{
	
}
