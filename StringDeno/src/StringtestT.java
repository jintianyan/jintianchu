
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
		//可以利用大小等于0的方式来判断大小
		if(strc.compareTo(strd)>0){
			System.out.println("大于");
		}
		
	}

}
