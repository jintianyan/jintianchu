
public class StringTestF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����ָ��������Ӧ���ַ���Ϣ
		String stra = "hello";
		char c = stra.charAt(0);
		System.out.println(c);
		
		//���ؽ����h
		
		String strb = "hello";
		char data [] =strb.toCharArray();
		for(int x = 0;x<data.length;x++){
			System.out.print(data[x]+", ");
			
		}
		System.out.println();
		//��helloת��Ϊ��д��ʽ���
		for(int x =0;x<data.length;x++){
			data[x] -= 32;
		}
		System.out.println(new String(data));	//��ȫ������ı���ַ���
		System.out.println(new String(data,1,2));	//����������ı���ַ���
		
		//���ؽ����h, e, l, l, o, 
		//		  HELLO
		//		  EL
		System.out.println();
		
		//����һ���ַ�����Ҫ���ж����Ƿ����������
		String strc = "123456789";
		if(isNumber(strc)){
			System.out.println("�ַ������������");
		}else{
			System.out.println("�ַ����ɷ��������");
		}
		//������Ϊ:�ַ������������
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
