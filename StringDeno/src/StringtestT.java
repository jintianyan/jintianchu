
public class StringtestT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stra = "HELLO";
		String strb = "hELLO";
		System.out.println(stra.equals(strb));
		System.out.println(stra.equalsIgnoreCase(strb));
		
		String strc = "Hello";
		String strd = "HEllo";
		System.out.println(strc.compareTo(strd));
		//�������ô�С����0�ķ�ʽ���жϴ�С
		if(strc.compareTo(strd)>0){
			System.out.println("����");
		}
		
	}

}
