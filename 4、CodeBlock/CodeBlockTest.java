/*
本类向我们介绍代码块：
定义：代码中用“{}”括起来的代码称为代码块。
分类：局部代码块、构造代码块、静态代码块。
	局部代码块：
		介绍：在main方法中（类似局部变量），给变量的限定生命周期（作用域），
			局部代码块的变量在执行结束后会被Java回收。
	构造代码块：
		介绍：在类的成员位置，在每次实例化对象的时候被调用；
		作用：可将多个构造方法中的相同代码放入构造代码中，对对象进行代码块。
	静态代码块：
		介绍：在类的成员位置，其被static修饰的代码；
		作用：一般用于给类初始化，被其修饰的代码仅仅执行一次。
运行顺序为：静态代码块→构造代码块→构造方法
*/
class CodeBlock{
		//构造代码块
	{
		System.out.println("这是CodeBlock的构造代码块");
	}
	//静态代码块
	static{
		System.out.println("注意以下代码块的运行顺序和次数！");
		System.out.println("这是CodeBlock的静态代码块");
	}
	//构造方法
	public CodeBlock(){
		System.out.println("这是CodeBlock的构造方法");
	}
}

public class CodeBlockTest{
	//静态代码块
	static{
		System.out.println("这是CodeBlockTest的静态代码块");
	}
	public static void main(String[] args){
		//局部代码块
		{
			System.out.println("这是CodeBlockTest的局部代码块");
		}
		//调用CodeBlock对象
		CodeBlock cb1 = new CodeBlock();
		CodeBlock cd2 = new CodeBlock();
	}
}
/*
代码的执行结果为：
	这是CodeBlockTest的构造代码块		//当运行CodeBlockTest时类先被加载
	这是CodeBlockTest的局部代码块		//由于JVM调用了main（）方法
	注意以下代码块的运行顺序和次数！
	这是CodeBlock的静态代码块			//以下结果表示虽然调用了俩次，但是静态代码块只被打印一次
	这是CodeBlock的构造代码块			//据下面运行的结果得出：运行顺序为：静态代码块→构造代码块→构造方法（其中静态代码块之运行一次）
	这是CodeBlock的构造方法
	这是CodeBlock的构造代码块
	这是CodeBlock的构造方法
*/