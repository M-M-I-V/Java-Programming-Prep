public class Box {
	public static void main(String[] args) {
		printBox(5);
	}

	static void printBox(int n) {
		for(int i = 0; i <= n - 1; i++) {
			if(i == 0 || i == n - 1) {
				System.out.println("X X X X X"); 
			} else {
				System.out.println("X " + "     " + " X");
			}
		}
	}
}
