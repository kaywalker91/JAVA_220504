package Study0504;

import Study0504.Test;

public class Study97_cons_input_replace 
{

	public static void main(String[] args) 
	{
		Test test1 = new Test(3000);
		Test test10 = new Test(100);
		Test test100 = new Test(1000);
		Test test2 = new Test(10,"Ŀ��");
		Test test3 = new Test("Ŀ��","�ܹ���","����",10);	
	}

}

class Test // Construct�� Ŭ������ �����ڸ��� �Ȱ���
{
	Test(int money)
	{
		String test = "�ȳ��ϼ���\n���԰����� �������"+money+"�����Դϴ�.";

		test = test.replace("�ȳ��ϼ���", "hello,World!");
	
		System.out.println(test);
		System.out.println();
	}
	Test(int money,String drink)
	{
		System.out.println("���� "+money+ "������ ���ܼ� "+drink+"�� ���̽��ϴ�.");
		System.out.println();
	}
	Test(String drink,String eat1,String eat2,int money)
	{
		System.out.println("���� "+drink+"�� "+eat1+"�� "+eat2+"�� �Ծ "+money+"������ ����ϴ�.");
		System.out.println();
	}
}

