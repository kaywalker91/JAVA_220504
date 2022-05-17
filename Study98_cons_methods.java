package Study0504;

import java.util.Scanner;

public class Study98_cons_methods 
{

	public static void main(String[] args) 
	{
		Gradeinout gradeinout = new Gradeinout();

	}

}

class Gradeinout
{
	Scanner sc = new Scanner(System.in);
	
	int kor=0;
	int eng=0;
	int math=0;
	String yn;
	
	int sum=kor+eng+math;
	int avg = sum/3;
	String grade;
	
	Gradeinout()
	{
		while(true)
		{
			input();
			
			choice();
			
			if(yn.equals("y"))
			{
				System.out.println();
			}
			else if(yn.equals("n"))
			{
				System.out.println("프로그램 종료.");
				break;	
			}					
		}
	}
	
	void choice()
	{
		sum=kor+eng+math;
		avg = sum/3;
		
		grade = hakjum(avg);
		
		System.out.println("총점: "+(kor+eng+math));
		System.out.println("평균: "+avg);
		System.out.println("학점: "+grade);
		
		System.out.print("계속하시겠습니까?(y,n) : ");
		yn = sc.next();
			
	}
	
	void input()
	{
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
		math = sc.nextInt();
	}
	
	String hakjum(int avg)
	{
		
		if(avg>=90 && avg<=100)
		{
			grade = "A입니다 축하합니다!";
		}
		
		else if(avg>=80 && avg<90)
		{
			grade = "B입니다 준수합니다!";
		}
		
		else if(avg>=70 && avg<80)
		{
			grade = "C입니다 조금 분발 바랍니다!";
		}
			
		else if(avg<70)
		{
			grade = "F입니다 열심히 하시기 바랍니다!";
		}
		
		return grade;
	
	}
	
}



