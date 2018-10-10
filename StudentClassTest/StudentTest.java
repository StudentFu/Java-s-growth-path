/**
	该程序为我们介绍简单的学生类的写法
	如下简写：
	私有的学生姓名（String类型）name
	私有的学生年龄（int类型）int
	
	空参构造方法
	有参构造方法（String类型的姓名，int类型的age）
	
	成员变量name访问器getName（）
	成员变量name变异器setName（）
	成员变量age访问器getAge（）
	成员变量age变异器setAge（）
	
	学生简单自我介绍的方法show（）
*/
class Student{
	//姓名
	private String name;
	//年龄
	private int age;
	
	//空参构造方法
	public Student(){}
	//有参构造方法
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	//获取name的值
	public String getName(){
		return name;
	}
	//设置name的值
	public void setName(String name){
		this.name = name;
	}
	//获取age的值
	public int getAge(){
		return age;
	}
	//设置age的值
	public void setAge(int age){
		this.age = age;
	}
	
	//对姓名和年龄的简单介绍
	public void show(){
		System.out.println("我叫"+name+"；"+"我今年"+age+"岁了！");
	}
}

/*
	对Student类进行测试
*/
public class StudentTest{
	public static void main(String[] agrs){
	Student s = new Student();
	System.out.println("先看下Student的默认值");
	System.out.println("name:"+s.getName()+"   "+"age:"+s.getAge());
	
	//利用构造方法对Student进行设置
	System.out.println();
	Student s1 = new Student("张三",30);
	s1.show();
	
	//利用set方法对Student进行设置
	System.out.println();
	Student s2 = new Student();
	s2.setName("李四");
	s2.setAge(18);
	s2.show();
	}
}