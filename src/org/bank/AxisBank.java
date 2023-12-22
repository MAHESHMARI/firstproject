package org.bank;

public class AxisBank extends BankInfo{
	public void Deposit(int Amount) {
		System.out.println("Deposit amount is :"+Amount );
		}
	
	public static void main(String[] args) {
		AxisBank s=new AxisBank();
		s.Deposit(1000);
		
		s.savings();
		s.fixed();
	}
}
