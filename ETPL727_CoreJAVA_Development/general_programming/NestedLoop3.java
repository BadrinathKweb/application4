package Com.evergent.corejava.general_programming;

public class NestedLoop3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(" "+c);
				c++;
			}
			System.out.println();
		}
	}
}
