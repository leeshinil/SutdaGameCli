import java.util.Random;

public class test2 {
	public static void main(String[] args) {

		int x[] = new int[4];
		int y[] = new int[4];

		Random random = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = random.nextInt(10) + 1;
			y[i] = random.nextInt(2) + 1;
			for (int a = 0; a < i; a++) {
				if (x[i] == x[a] && y[i] == y[a])
					i--;
			}
		}
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i] + " , " + y[i]);
		}
		String a[] = new String[4];
		for(int i = 0; i < 4; i ++) {
			a[i] = x[i] + "." + y[i];
		}
		System.out.println();
		for (int i = 0; i < x.length; i++) {
			System.out.println(a[i]);
		}
		
	}
}