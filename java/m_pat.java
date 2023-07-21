public class m_pat {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (j == 0 || j == rows - 1 || (i == j && i <= rows / 2) || (i + j == rows - 1 && i <= rows / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
