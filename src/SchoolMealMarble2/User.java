package SchoolMealMarble2;

interface UserInterface{
	//int location; = ����� ��ġ ����
	int User(String name); 
	//int Money;		����� ���� ������ �ִ� �ݾ�
	//int totalMoney; ����� ��Ż �ݾ� ����
	//int POKETMONET=200000; ������ ���� ����
	void forSale(int n);// user�� �̸��� ���� �ǹ� ���, n = ����� /
	// ����Ẹ�� ũ�ų� ������ �Ű� �Ϸ�.
	// ���� user�� ���� �ݾ� += �Ű��� �ǹ����� �Ǽ���
	void backruptcy();//�Ļ�
	void move();
	void Steal();//������ ������ ������ ���� ���� ��� ������ ���� ���� ������
}
public class User {
	
}

