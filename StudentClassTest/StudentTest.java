/**
	�ó���Ϊ���ǽ��ܼ򵥵�ѧ�����д��
	���¼�д��
	˽�е�ѧ��������String���ͣ�name
	˽�е�ѧ�����䣨int���ͣ�int
	
	�ղι��췽��
	�вι��췽����String���͵�������int���͵�age��
	
	��Ա����name������getName����
	��Ա����name������setName����
	��Ա����age������getAge����
	��Ա����age������setAge����
	
	ѧ�������ҽ��ܵķ���show����
*/
class Student{
	//����
	private String name;
	//����
	private int age;
	
	//�ղι��췽��
	public Student(){}
	//�вι��췽��
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	//��ȡname��ֵ
	public String getName(){
		return name;
	}
	//����name��ֵ
	public void setName(String name){
		this.name = name;
	}
	//��ȡage��ֵ
	public int getAge(){
		return age;
	}
	//����age��ֵ
	public void setAge(int age){
		this.age = age;
	}
	
	//������������ļ򵥽���
	public void show(){
		System.out.println("�ҽ�"+name+"��"+"�ҽ���"+age+"���ˣ�");
	}
}

/*
	��Student����в���
*/
public class StudentTest{
	public static void main(String[] agrs){
	Student s = new Student();
	System.out.println("�ȿ���Student��Ĭ��ֵ");
	System.out.println("name:"+s.getName()+"   "+"age:"+s.getAge());
	
	//���ù��췽����Student��������
	System.out.println();
	Student s1 = new Student("����",30);
	s1.show();
	
	//����set������Student��������
	System.out.println();
	Student s2 = new Student();
	s2.setName("����");
	s2.setAge(18);
	s2.show();
	}
}