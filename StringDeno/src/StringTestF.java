
public class StringTestF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//返回指定索引对应的字符信息
		String stra = "hello";
		char c = stra.charAt(0);
		System.out.println(c);
		
		//返回结果：h
		
		String strb = "hello";
		char data [] =strb.toCharArray();
		for(int x = 0;x<data.length;x++){
			System.out.print(data[x]+", ");
			
		}
		System.out.println();
		//将hello转化为大写形式输出
		for(int x =0;x<data.length;x++){
			data[x] -= 32;
		}
		System.out.println(new String(data));	//将全部数组改变成字符串
		System.out.println(new String(data,1,2));	//将部分数组改变成字符串
		
		//返回结果：h, e, l, l, o, 
		//		  HELLO
		//		  EL
		System.out.println();
		
		//给定一个字符串，要求判断其是否由数字组成
		String strc = "123456789";
		if(isNumber(strc)){
			System.out.println("字符串由数字组成");
		}else{
			System.out.println("字符串由非数字组成");
		}
		//输出结果为:字符串由数字组成
	}
	public static boolean isNumber(String temp){
		char center [] =temp.toCharArray();
		for(int x = 0;x<center.length;x++){
			if(center[x]>'9'|| center[x]<'0'){
				return false;
			}
		}
		return true;
	}
}
