/*
	�������ͨ����������Ϸ����java.lang.Math����Math.random()���������
	
	Ҫ�����û���������ɵ�1~100�����ݽ��в�ȡ����¼�²�ȡ�Ĵ���
	
	���������
		1�����������
			������Math.random()��������1~100������֣�
		2��������ѭ�����û������ݽ��ж�β�ȡ
			���ڲ�ȷ������������£�
			  ���ǲ���while(true){}�ķ���������ж�β�ȡ����¼��ȡ�Ĵ�����
		3����������жϸ����û��������µķ��򣨴��ˡ�С�ˡ������ˣ�
			������if...else if...else������������µķ�����
			  �����������ʾ������ȡ�ķ���
*/

import java.util.Scanner;

public class GuessNumber{
	public static void main(String[] args){
		//�������1~100�������
		int rd = (int)(Math.random()*100)+1;
		
		//������
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while(true){
			//����¼������
			System.out.print("������һ��1~100�����֣�");	//������ʾ
			int guessNumber = sc.nextInt();
			//���в�ȡ�������ʾ
			if(guessNumber > rd){
				count++;
				System.out.println("���µ����֣�"+guessNumber+"���ˣ�");
			}else if(guessNumber < rd){
				count++;
				System.out.println("���µ����֣�"+guessNumber+"С�ˣ�");
			}else{
				++count;
				System.out.println("���¶��ˣ�������"+count+"��Ŷ���´μ������ͣ�");
				break;
			}
		}
	}
}