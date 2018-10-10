/*
	�����������ǽ����Զ��幤���������
	1����дһ�������ࣻ
		��ע�⣺���ĵ�ע��˵����������Ĳ��ĺ����˵�ʹ�÷��㣩
	2���ù���javadoc���������ĵ�ע��
		��dos�������������´��룺
			javadoc -d ����·�� -author -version ����.java
*/
//��ʼ���ǵĹ���������
/**
*	���鳣�õĲ���������
*	@author		Fu
*	@version	v1.0
*/
public class ArrayTool{
	//�����췽��˽�л���ʹ�䲻��ʵ�����󣬴Ӷ��ﵽ��Լϵͳ��Դ��
	private ArrayTool(){}
	/**
	*	��������
	*	@param	arr[]
	*/
	//���䷽������Ϊstatic�������Ա�������ֱ�ӵ���
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
	*	��ȡָ����ֵ����
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
	*	��ȡ�����е����ֵ
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