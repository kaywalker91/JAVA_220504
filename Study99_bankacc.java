package Study0504;

import java.util.Scanner;

public class Study99_bankacc 
{

	public static void main(String[] args) 
	{
		Acc acc = new Acc();
	}

}

class Acc
{
	Scanner sc = new Scanner(System.in);
	
	private String accnum="00000";
	private String accpw="0000";
	
	private String accnum1;
	private String accpw1;
	
	private int money=0;
	private int inputmoney;
	private int outputmoney;
	private int sel;
	
	Acc()
	{
		while(true)
		{
			choice();
			
			if(sel == 1)
			{
				inforinput();
			}
			else if(sel == 2)
			{
				moneyinput();
			}
			else if(sel == 3)
			{
				moneyoutput();
			}
			else if(sel == 4)
			{
				check();
			}	
			else if(sel == 5)
			{
				System.out.println("���α׷� ����.");
				break;	
			}					
		}
	}
	
	void choice()
	{
		System.out.println("<������� ���ø����̼�>");
		System.out.println("1.���»���");
		System.out.println("2.�Ա�");
		System.out.println("3.���");
		System.out.println("4.Ȯ��");
		System.out.println("5.����");
		System.out.print("����:");
		sel = sc.nextInt();
		System.out.println();
	}
	
	void inforinput()
	{
		System.out.print("���¹�ȣ�Է�: ");
		accnum = sc.next();
		System.out.print("���º���Է�: ");
		accpw = sc.next();
		System.out.println();
	}
	
	void moneyinput()
	{
		System.out.print("���¹�ȣ�Է�: ");
		accnum1 = sc.next();
		
		if(accnum.equals(accnum1))
		{
			System.out.println("����ݾ�: "+money);
			System.out.print("�Աݾ�: ");
			inputmoney = sc.nextInt();
			money += inputmoney;
			System.out.println("�Ա����� �ݾ�: "+money);
			System.out.println();
		}
		else
		{
			System.out.println("���¹�ȣ�� Ȯ���ϼ���.");
		}
		
	}
	
	void moneyoutput()
	{
		System.out.print("���¹�ȣ�Է�: ");
		accnum1 = sc.next();
		System.out.print("���º���Է�: ");
		accpw1 = sc.next();
		
		if(accnum.equals(accnum1))
		{
			if(accpw.equals(accpw1))
			{
				System.out.println("����ݾ�: "+money);
				System.out.print("��ݾ�: ");
				outputmoney = sc.nextInt();
				money -= outputmoney;
				System.out.println("������� �ݾ�: "+money);
				System.out.println();
			}
			else
			{
				System.out.println("��й�ȣ�� Ȯ���ϼ���.");
			}
		}
		else
		{
			System.out.println("���¹�ȣ�� Ȯ���ϼ���.");
		}
	}	
	
	void check()
	{
		System.out.println("<������� ����Ȯ��>");
		System.out.println("***���¹�ȣ***: "+accnum);
		System.out.println("**���º�й�ȣ**: "+accpw);
		System.out.println("***���ݱݾ�***: " +money);
		System.out.println();
	}
	
}