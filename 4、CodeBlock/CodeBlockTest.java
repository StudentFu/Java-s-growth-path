/*
���������ǽ��ܴ���飺
���壺�������á�{}���������Ĵ����Ϊ����顣
���ࣺ�ֲ�����顢�������顢��̬����顣
	�ֲ�����飺
		���ܣ���main�����У����ƾֲ������������������޶��������ڣ������򣩣�
			�ֲ������ı�����ִ�н�����ᱻJava���ա�
	�������飺
		���ܣ�����ĳ�Աλ�ã���ÿ��ʵ���������ʱ�򱻵��ã�
		���ã��ɽ�������췽���е���ͬ������빹������У��Զ�����д���顣
	��̬����飺
		���ܣ�����ĳ�Աλ�ã��䱻static���εĴ��룻
		���ã�һ�����ڸ����ʼ�����������εĴ������ִ��һ�Ρ�
����˳��Ϊ����̬������������������췽��
*/
class CodeBlock{
		//��������
	{
		System.out.println("����CodeBlock�Ĺ�������");
	}
	//��̬�����
	static{
		System.out.println("ע�����´���������˳��ʹ�����");
		System.out.println("����CodeBlock�ľ�̬�����");
	}
	//���췽��
	public CodeBlock(){
		System.out.println("����CodeBlock�Ĺ��췽��");
	}
}

public class CodeBlockTest{
	//��̬�����
	static{
		System.out.println("����CodeBlockTest�ľ�̬�����");
	}
	public static void main(String[] args){
		//�ֲ������
		{
			System.out.println("����CodeBlockTest�ľֲ������");
		}
		//����CodeBlock����
		CodeBlock cb1 = new CodeBlock();
		CodeBlock cd2 = new CodeBlock();
	}
}
/*
�����ִ�н��Ϊ��
	����CodeBlockTest�Ĺ�������		//������CodeBlockTestʱ���ȱ�����
	����CodeBlockTest�ľֲ������		//����JVM������main��������
	ע�����´���������˳��ʹ�����
	����CodeBlock�ľ�̬�����			//���½����ʾ��Ȼ���������Σ����Ǿ�̬�����ֻ����ӡһ��
	����CodeBlock�Ĺ�������			//���������еĽ���ó�������˳��Ϊ����̬������������������췽�������о�̬�����֮����һ�Σ�
	����CodeBlock�Ĺ��췽��
	����CodeBlock�Ĺ�������
	����CodeBlock�Ĺ��췽��
*/