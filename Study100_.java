package Study0504;

public class Study100_ 
{

	public static void main(String[] args) 
	{
		A a = new A();
		a.myMoney();
		
		a.money -= 20000; //주어진 변수값이 일시적으로 변경된다
		
		A a1 = new A();
		a1.myMoney();
		
		Study101_B.myMoney();
		
		Study101_B.money = Study101_B.money - 50000; //주어진 변수값이 변경된다
		
		Study101_B b = new Study101_B();
		b.myMoney();
		
		Study101_B.money = Study101_B.money - 20000; //주어진 변수값이 변경된다
		
		Study101_B.myMoney();
	}

}

class A
{	
	String name = "홍길동";
	int money = 20000;
	
	void aMenu()
	{
		System.out.println(name+"은 한양에 삽니다.");
	}
	
	void myMoney()
	{
		System.out.println("A가 가진 돈: "+money);
	}
	
}
