/*
	本程序向我们介绍自定义工具类的制作
	1、编写一个工具类；
		（注意：加文档注释说明，方便今后的查阅和他人的使用方便）
	2、用工具javadoc工具生成文档注释
		在dos窗口下运行以下代码：
			javadoc -d 保存路径 -author -version 类名.java
*/
//开始我们的工具类制作
/**
*	数组常用的操作工具类
*	@author		Fu
*	@version	v1.0
*/
public class ArrayTool{
	//将构造方法私有化（使其不能实例对象，从而达到节约系统资源）
	private ArrayTool(){}
	/**
	*	遍历数组
	*	@param	arr[]
	*/
	//将其方法定义为static方法，以便类名的直接调用
	public static void printArray(int[] arr){
		System.out.print("[");
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				System.out.println(arr[i]+"]");
			}else{
				System.out.print(arr[i]+",");
			}
		}
	}
	/**
	*	获取指定数值索引
	*	@param arr[]
	*	@param number
	*	@return	int
	*/
	public static int getIndex(int[] arr,int number){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==number)
				return i;
		}
		return -1;
	}
	/**
	*	获取数组中的最大值
	*	@param arr[]
	*	@return	int
	*/
	public static int getMax(int[] arr){
		int max = arr[0];
		for(int i=0;i<arr.length;i++){
			max = max>arr[i]?max:arr[i];
		}
		return max;
	}
}