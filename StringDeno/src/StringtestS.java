
public class StringtestS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "helloworld";
		byte data [] = str.getBytes();//���ַ�����Ϊ�ֽ�����
		for(int x = 0;x<data.length;x++){
			data[x] -= 32;//��Сд��ĸ��ɴ�д��ʽ
		}
		String text = new String(data);
		System.out.println(text);//���ֽ�����ȫ��ת��Ϊ�ַ���
		System.out.println(new String(data,5,5));//���ֽ����鲿��ת��Ϊ�ַ���
		
	}

}
