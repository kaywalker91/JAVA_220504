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
				System.out.println("프로그램 종료.");
				break;	
			}					
		}
	}
	
	void choice()
	{
		System.out.println("<은행계좌 어플리케이션>");
		System.out.println("1.계좌생성");
		System.out.println("2.입금");
		System.out.println("3.출금");
		System.out.println("4.확인");
		System.out.println("5.종료");
		System.out.print("선택:");
		sel = sc.nextInt();
		System.out.println();
	}
	
	void inforinput()
	{
		System.out.print("계좌번호입력: ");
		accnum = sc.next();
		System.out.print("계좌비번입력: ");
		accpw = sc.next();
		System.out.println();
	}
	
	void moneyinput()
	{
		System.out.print("계좌번호입력: ");
		accnum1 = sc.next();
		
		if(accnum.equals(accnum1))
		{
			System.out.println("현재금액: "+money);
			System.out.print("입금액: ");
			inputmoney = sc.nextInt();
			money += inputmoney;
			System.out.println("입금이후 금액: "+money);
			System.out.println();
		}
		else
		{
			System.out.println("계좌번호를 확인하세요.");
		}
		
	}
	
	void moneyoutput()
	{
		System.out.print("계좌번호입력: ");
		accnum1 = sc.next();
		System.out.print("계좌비번입력: ");
		accpw1 = sc.next();
		
		if(accnum.equals(accnum1))
		{
			if(accpw.equals(accpw1))
			{
				System.out.println("현재금액: "+money);
				System.out.print("출금액: ");
				outputmoney = sc.nextInt();
				money -= outputmoney;
				System.out.println("출금이후 금액: "+money);
				System.out.println();
			}
			else
			{
				System.out.println("비밀번호를 확인하세요.");
			}
		}
		else
		{
			System.out.println("계좌번호를 확인하세요.");
		}
	}	
	
	void check()
	{
		System.out.println("<은행계좌 정보확인>");
		System.out.println("***계좌번호***: "+accnum);
		System.out.println("**계좌비밀번호**: "+accpw);
		System.out.println("***현금금액***: " +money);
		System.out.println();
	}
	
}