
public class StringtestFouth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "helloworld";
		//���������������ʵĵ�һ����ĸ������
		System.out.println(str.indexOf("world"));
		//���ص�һ�����ҵ�l������
		System.out.println(str.indexOf("l"));
		//�ӵ������ʼ���ҵ�һ��l������
		System.out.println(str.indexOf("l",5));
		//�Ӻ�ʼ���ҵ�һ��l������
		System.out.println(str.lastIndexOf("l"));
		//�����������ĵ��ʷ���-1
		System.out.println(str.indexOf("xxxx"));
		
		
		//ʹ��contains�ж�
		if(str.contains("world")){
			System.out.println("���Բ�ѯ�����ݡ�");
		}
		//�жϿ�ͷ�ͽ�β
		System.out.println(str.startsWith("he"));
		System.out.println(str.startsWith("wo",5));
		System.out.println(str.endsWith("ld"));
		
		//�ַ����滻
		String strc = "helloworld";
		String chance1 = strc.replaceAll("l","s");
		String chance2 = strc.replaceFirst("l","c");
		System.out.println(chance1);
		System.out.println(chance2);
		
		//�ַ����Ľ�ȡ
		String strf = "helloworld";
		String chance3 = strf.substring(5);
		String chance4 = strf.substring(0,5);
		System.out.println(chance3);
		System.out.println(chance4);
		
		System.out.println();
		
		
		//�ַ����Ĳ��
		String strg = "hello world nihao miss";
		String result [] = strg.split(" ");
		for(int x = 0;x<result.length;x++){
			System.out.println(result[x]);
		}
		System.out.println();
		
		//���limit�������鳤��
		String result2 [] = strg.split(" ",3);
		for(int x = 0;x<result2.length;x++){
			System.out.println(result2[x]);
		}
		
		System.out.println();
		
		
		//��"����:10|����:20|����:30"���в��
		String strh = "����:10|����:20|����:30";
		String result3 [] = strh.split("\\|");
		for(int x = 0;x<result3.length;x++){
			String temp [] = result3[x].split(":");
			System.out.println("������"+temp[0]+"�����䣺"+temp[1]);
		}
		
		
	}

}
