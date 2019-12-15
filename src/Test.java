import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		int[][] data = {
				{4, 6, 3, 10},
				{4, 2, 40, 1},
				{5, 34, 1, 3}
		};
		
		
		for(int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}
}
