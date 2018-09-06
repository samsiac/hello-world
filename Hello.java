public class Hello{	//一个文件里只能存在一个public，且类名和文件名必须相同
	
	//int x;	//成员变量
	
	/*
	 * 函数 - 方法method
	 */
	public static void main (String[] args) {
		//TODO Auto-generated method stub
		//main方法为执行的入口
		//x=x+1
		System.out.println("Hello。。。。。。。。 World!");//print不换行
		System.out.println("Hello World!...................");
	
		int x;//标识符：字符 数字 _ $
		double d = 1.2;
		float f = 1.5f;
		char c = '龙',c1;//ascll码表/unicode码表
		boolean b = true;
		
		x =(int) d;//*******强制类型转换，前面加上转换类型****************
		d = x;//自动转化为1.0
		System.out.println("x=" + x);
		System.out.println("d=" + d);
		System.out.println((int)c);
		
		
		for(c1=c;c1<c+10;c1++)//c+10转换为字符型和整数型，字符型精度低，自动转换
			System.out.print((char)c1 + " ");
		
		int arr[] = new int[5];//json:[]一个集合，{}一个对象
		arr[0] = 100;
		arr[4] = 500;
		
		int arr1[] = {100,200,40,500};
		for(x=0;x<arr.length;x++)
			System.out.print(arr[x] + ", ");
		
		for(int y : arr)
			System.out.print(y+", ");
	}
}

/*println为换行输出
 * print不换行
 * java.lang.package默认为语言包里的类
 * 
 * Java App:类 （设计阶段） A　　B　　C　　。。。。。。。。。
 * 对象（运行阶段）
 * 
 * 命令行设置路径：set path=C:\Java\jdk1.7.0_72\bin
 * */
/*
 **************数据类型8种***************
 *
 * 整型：byte1 short2 int4 long8(精度从高往低不能自动转换/从低到高可自动)
 * 
 * 浮点型：float4 double8
 * 
 * 字符型:char
 * 
 * bool型: boolean
 * 
 * 
 * 
 * ***********数组*****************************
 * 特点：定长、同一种数据类型(同一数组内)
 * 0 ~ n-1
 * 集合对象：ArrayList  变长的数组   动态在数组
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
 