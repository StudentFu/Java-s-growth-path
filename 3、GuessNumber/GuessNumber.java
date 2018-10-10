/*
	下面程序通过猜数字游戏加深java.lang.Math包中Math.random()方法的理解
	
	要求：让用户对随机生成的1~100的数据进行猜取并记录下猜取的次数
	
	程序分析：
		1、产生随机数
			（利用Math.random()方法产生1~100间的数字）
		2、利用死循环让用户对数据进行多次猜取
			（在不确定次数的情况下，
			  我们采用while(true){}的方法对其进行多次采取并记录猜取的次数）
		3、对你进行判断告诉用户接下来猜的方向（大了、小了、猜中了）
			（利用if...else if...else对其三种情况下的分析，
			  并对其进行提示引导猜取的方向）
*/

import java.util.Scanner;

public class GuessNumber{
	public static void main(String[] args){
		//随机生成1~100的随机数
		int rd = (int)(Math.random()*100)+1;
		
		//计数器
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while(true){
			//键盘录入数据
			System.out.print("请输入一个1~100的数字：");	//输入提示
			int guessNumber = sc.nextInt();
			//进行猜取方向的提示
			if(guessNumber > rd){
				count++;
				System.out.println("您猜的数字："+guessNumber+"大了！");
			}else if(guessNumber < rd){
				count++;
				System.out.println("您猜的数字："+guessNumber+"小了！");
			}else{
				++count;
				System.out.println("您猜对了！您猜了"+count+"次哦！下次继续加油！");
				break;
			}
		}
	}
}