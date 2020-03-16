
public class StringtestFouth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "helloworld";
		//返回满足条件单词的第一个字母的索引
		System.out.println(str.indexOf("world"));
		//返回第一个查找到l的索引
		System.out.println(str.indexOf("l"));
		//从第五个开始查找第一个l的索引
		System.out.println(str.indexOf("l",5));
		//从后开始查找第一个l的索引
		System.out.println(str.lastIndexOf("l"));
		//不满足条件的单词返回-1
		System.out.println(str.indexOf("xxxx"));
		
		
		//使用contains判断
		if(str.contains("world")){
			System.out.println("可以查询到数据。");
		}
		//判断开头和结尾
		System.out.println(str.startsWith("he"));
		System.out.println(str.startsWith("wo",5));
		System.out.println(str.endsWith("ld"));
		
		//字符串替换
		String strc = "helloworld";
		String chance1 = strc.replaceAll("l","s");
		String chance2 = strc.replaceFirst("l","c");
		System.out.println(chance1);
		System.out.println(chance2);
		
		//字符串的截取
		String strf = "helloworld";
		String chance3 = strf.substring(5);
		String chance4 = strf.substring(0,5);
		System.out.println(chance3);
		System.out.println(chance4);
		
		System.out.println();
		
		
		//字符串的拆分
		String strg = "hello world nihao miss";
		String result [] = strg.split(" ");
		for(int x = 0;x<result.length;x++){
			System.out.println(result[x]);
		}
		System.out.println();
		
		//添加limit限制数组长度
		String result2 [] = strg.split(" ",3);
		for(int x = 0;x<result2.length;x++){
			System.out.println(result2[x]);
		}
		
		System.out.println();
		
		
		//对"张三:10|李四:20|王五:30"进行拆分
		String strh = "张三:10|李四:20|王五:30";
		String result3 [] = strh.split("\\|");
		for(int x = 0;x<result3.length;x++){
			String temp [] = result3[x].split(":");
			System.out.println("姓名："+temp[0]+"，年龄："+temp[1]);
		}
		
		
	}

}
