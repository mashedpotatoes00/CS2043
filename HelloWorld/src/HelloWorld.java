
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		int num = 1;
		int row = 9;
		while(num<row) {
			for(int i=0; i<num;i++) {
				System.out.print("*");
			}
			System.out.println();
			num++;
		}
	}
}
