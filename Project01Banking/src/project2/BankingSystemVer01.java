package project2;

import project2.ver01.Account;

public class BankingSystemVer01
{

	public static void main(String[] args)
	{
		Account acc1 = new Account("111_222_4444", "홍길동", 10000);
		acc1.showAccountInfo();
	}

}
