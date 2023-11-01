package pattern;

public class pattern2 {
	public static void main(String[] args) {
        int rows = 5; // Number of rows
        int columns = 5; // Number of columns

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }










}
