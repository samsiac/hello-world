public class Hello{	//һ���ļ���ֻ�ܴ���һ��public�����������ļ���������ͬ
	
	//int x;	//��Ա����
	
	/*
	 * ���� - ����method
	 */
	public static void main (String[] args) {
		//TODO Auto-generated method stub
		//main����Ϊִ�е����
		//x=x+1
		System.out.println("Hello���������������� World!");//print������
		System.out.println("Hello World!...................");
	
		int x;//��ʶ�����ַ� ���� _ $
		double d = 1.2;
		float f = 1.5f;
		char c = '��',c1;//ascll���/unicode���
		boolean b = true;
		
		x =(int) d;//*******ǿ������ת����ǰ�����ת������****************
		d = x;//�Զ�ת��Ϊ1.0
		System.out.println("x=" + x);
		System.out.println("d=" + d);
		System.out.println((int)c);
		
		
		for(c1=c;c1<c+10;c1++)//c+10ת��Ϊ�ַ��ͺ������ͣ��ַ��;��ȵͣ��Զ�ת��
			System.out.print((char)c1 + " ");
		
		int arr[] = new int[5];//json:[]һ�����ϣ�{}һ������
		arr[0] = 100;
		arr[4] = 500;
		
		int arr1[] = {100,200,40,500};
		for(x=0;x<arr.length;x++)
			System.out.print(arr[x] + ", ");
		
		for(int y : arr)
			System.out.print(y+", ");
	}
}

/*printlnΪ�������
 * print������
 * java.lang.packageĬ��Ϊ���԰������
 * 
 * Java App:�� ����ƽ׶Σ� A����B����C����������������������
 * �������н׶Σ�
 * 
 * ����������·����set path=C:\Java\jdk1.7.0_72\bin
 * */
/*
 **************��������8��***************
 *
 * ���ͣ�byte1 short2 int4 long8(���ȴӸ����Ͳ����Զ�ת��/�ӵ͵��߿��Զ�)
 * 
 * �����ͣ�float4 double8
 * 
 * �ַ���:char
 * 
 * bool��: boolean
 * 
 * 
 * 
 * ***********����*****************************
 * �ص㣺������ͬһ����������(ͬһ������)
 * 0 ~ n-1
 * ���϶���ArrayList  �䳤������   ��̬������
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
 