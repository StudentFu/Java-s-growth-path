/*
	本程序向我们介绍继承中的构造方法间的关系
*/
class Fu{
	int i = 0;
	//父类的无参构造方法
	public Fu(){
		System.out.println("这是父类的无参构造方法");
	}
	//父类的有参构造方法
	public Fu(int i){
		this.i = i;
		System.out.println("这是父类的有参构造方法");
	}
}

class Zi extends Fu{
	//子类的无参构造方法
	public Zi(){
		//super();			//子类的构造器中默认调用父类的无参构造方法
		//super(i);			// 若是父类中变量没有赋默认值则会报错（错误: 无法在调用超类型构造器之前引用i）。
		System.out.println("这是子类中的无参构造方法");
	}
	//子类的有参构造方法
	public Zi(int i){
		//super();			//默认调用父类的无参构造方法
		//super(i);			//程序运行正常，将i传给父类调用父类的有参构造方法赋值
		super.i = i;
		System.out.println("这是子类的有参构造方法");
	}
}

//测试
public class Constructor{
	public static void main(String[] args){
		Zi z = new Zi();
		System.out.println(z.i);
		System.out.println("————————————————");
		Zi z1 = new Zi(20);
		System.out.println(z1.i);
	}
}