package Study0504;

public class Study100_ 
{

	public static void main(String[] args) 
	{
		A a = new A();
		a.myMoney();
		
		a.money -= 20000; //�־��� �������� �Ͻ������� ����ȴ�
		
		A a1 = new A();
		a1.myMoney();
		
		Study101_B.myMoney();
		
		Study101_B.money = Study101_B.money - 50000; //�־��� �������� ����ȴ�
		
		Study101_B b = new Study101_B();
		b.myMoney();
		
		Study101_B.money = Study101_B.money - 20000; //�־��� �������� ����ȴ�
		
		Study101_B.myMoney();
	}

}

class A
{	
	String name = "ȫ�浿";
	int money = 20000;
	
	void aMenu()
	{
		System.out.println(name+"�� �Ѿ翡 ��ϴ�.");
	}
	
	void myMoney()
	{
		System.out.println("A�� ���� ��: "+money);
	}
	
}
