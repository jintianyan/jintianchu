
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str = new String("Hello World");
		System.out.println(str);*/
		
		/*String stra = "null";
		if(stra.equals("hello")){
			System.out.println("hello world");
		}
		*/
		
		
		//冒泡排序
		int numa [] = new int[]{2,1,9,0,5,3,7,6,8,4};
		for(int x = 0;x<numa.length;x++){
			for(int y = 0;y<numa.length-1;y++){
				if(numa[y]>numa[y+1]){
					int temp = numa[y];
					numa[y] = numa[y+1];
					numa[y+1] = temp;
				}
			}
		}
		for(int i = 0;i<numa.length;i++){
			System.out.print(numa[i]+", ");
		}
		
		System.out.println("\n");
	
		
		//首位交换
		int numb [] = new int[]{1,2,3,4,5,6,7,8};
		int center = numb.length-1;
		for(int x = 0;x<numb.length/2;x++){
			int tempb = numb[center];
			numb[center] = numb[x];
			numb[x] = tempb;
			center--;
		}
		for(int y = 0;y<numb.length;y++){
			System.out.print(numb[y]+", ");
		}
		
		System.out.println("\n");
		
		//二维数组转置
		int numc[][] = new int[][]{
			{1,2,3},{4,5,6},{7,8,9}
		};
		/*for(int x = 0;x<numc.length;x++){
			for(int y = 0;y<numc[x].length;y++){
				if(x<y){
					int tempc = numc[x][y];
					numc[x][y] = numc[y][x];
					numc[y][x] = tempc;
				}
			}
		}*/
		for(int x = 0;x<numc.length;x++){
			for(int y = x;y<numc[x].length;y++){
				if(x!=y){
					int tempc = numc[x][y];
					numc[x][y] = numc[y][x];
					numc[y][x] = tempc;
				}
			}
		}
		for(int x = 0;x<numc.length;x++){
			for(int y = 0;y<numc[x].length;y++){
				System.out.print(numc[x][y]+" ");
			}
			System.out.println();
		}
		
		//数组拷贝
		int data[] = new int[]{1,2,3,4,5,6,7,8,9};
		int datav[] = new int[]{11,22,33,44,55,66,77,88,99};
		System.arraycopy(data, 2, datav, 3, 3);
		for(int x = 0;x<datav.length;x++){
			System.out.print(datav[x]+", ");
		}
	}

}
