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
				System.out.println("���α׷� ����.");
				break;	
			}					
		}
	}
	
	void choice()
	{
		sum=kor+eng+math;
		avg = sum/3;
		
		grade = hakjum(avg);
		
		System.out.println("����: "+(kor+eng+math));
		System.out.println("���: "+avg);
		System.out.println("����: "+grade);
		
		System.out.print("����Ͻðڽ��ϱ�?(y,n) : ");
		yn = sc.next();
			
	}
	
	void input()
	{
		System.out.print("����: ");
		kor = sc.nextInt();
		System.out.print("����: ");
		eng = sc.nextInt();
		System.out.print("����: ");
		math = sc.nextInt();
	}
	
	String hakjum(int avg)
	{
		
		if(avg>=90 && avg<=100)
		{
			grade = "A�Դϴ� �����մϴ�!";
		}
		
		else if(avg>=80 && avg<90)
		{
			grade = "B�Դϴ� �ؼ��մϴ�!";
		}
		
		else if(avg>=70 && avg<80)
		{
			grade = "C�Դϴ� ���� �й� �ٶ��ϴ�!";
		}
			
		else if(avg<70)
		{
			grade = "F�Դϴ� ������ �Ͻñ� �ٶ��ϴ�!";
		}
		
		return grade;
	
	}
	
}



