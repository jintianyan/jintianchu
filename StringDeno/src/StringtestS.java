
public class StringtestS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "helloworld";
		byte data [] = str.getBytes();//将字符串变为字节数组
		for(int x = 0;x<data.length;x++){
			data[x] -= 32;//将小写字母变成大写形式
		}
		String text = new String(data);
		System.out.println(text);//将字节数组全部转换为字符串
		System.out.println(new String(data,5,5));//将字节数组部分转换为字符串
		
	}

}
