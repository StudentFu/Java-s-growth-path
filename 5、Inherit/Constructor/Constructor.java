/*
	�����������ǽ��ܼ̳��еĹ��췽����Ĺ�ϵ
*/
class Fu{
	int i = 0;
	//������޲ι��췽��
	public Fu(){
		System.out.println("���Ǹ�����޲ι��췽��");
	}
	//������вι��췽��
	public Fu(int i){
		this.i = i;
		System.out.println("���Ǹ�����вι��췽��");
	}
}

class Zi extends Fu{
	//������޲ι��췽��
	public Zi(){
		//super();			//����Ĺ�������Ĭ�ϵ��ø�����޲ι��췽��
		//super(i);			// ���Ǹ����б���û�и�Ĭ��ֵ��ᱨ������: �޷��ڵ��ó����͹�����֮ǰ����i����
		System.out.println("���������е��޲ι��췽��");
	}
	//������вι��췽��
	public Zi(int i){
		//super();			//Ĭ�ϵ��ø�����޲ι��췽��
		//super(i);			//����������������i����������ø�����вι��췽����ֵ
		super.i = i;
		System.out.println("����������вι��췽��");
	}
}

//����
public class Constructor{
	public static void main(String[] args){
		Zi z = new Zi();
		System.out.println(z.i);
		System.out.println("��������������������������������");
		Zi z1 = new Zi(20);
		System.out.println(z1.i);
	}
}