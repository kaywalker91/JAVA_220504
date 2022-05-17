package Study0504;

import Study0504.Test;

public class Study97_cons_input_replace 
{

	public static void main(String[] args) 
	{
		Test test1 = new Test(3000);
		Test test10 = new Test(100);
		Test test100 = new Test(1000);
		Test test2 = new Test(10,"커피");
		Test test3 = new Test("커피","햄버거","피자",10);	
	}

}

class Test // Construct은 클래스명 생성자명이 똑같다
{
	Test(int money)
	{
		String test = "안녕하세요\n신입개발자 희망연봉"+money+"만원입니다.";

		test = test.replace("안녕하세요", "hello,World!");
	
		System.out.println(test);
		System.out.println();
	}
	Test(int money,String drink)
	{
		System.out.println("오늘 "+money+ "만원이 생겨서 "+drink+"를 마셨습니다.");
		System.out.println();
	}
	Test(String drink,String eat1,String eat2,int money)
	{
		System.out.println("오늘 "+drink+"와 "+eat1+"와 "+eat2+"를 먹어서 "+money+"만원을 썼습니다.");
		System.out.println();
	}
}

