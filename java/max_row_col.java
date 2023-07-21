public class max_row_col {
    public static void main(String[] args) {
        int[][] array = {
            { 5, 8, 2 },
            { 3, 1, 9 },
            { 4, 7, 6 }
        };

        int numRows = array.length;
        int numCols = array[0].length; // Assuming the array has consistent column sizes

        int[] maxRowValues = new int[numRows]; // Array to store maximum values of each row
        int[] maxColValues = new int[numCols]; // Array to store maximum values of each column

        // Find maximum values for each row
        for (int i = 0; i < numRows; i++) {
            int maxRow = Integer.MIN_VALUE;
            for (int j = 0; j < numCols; j++) {
                maxRow = Math.max(maxRow, array[i][j]);
            }
            maxRowValues[i] = maxRow;
        }

        // Find maximum values for each column
        for (int j = 0; j < numCols; j++) {
            int maxCol = Integer.MIN_VALUE;
            for (int i = 0; i < numRows; i++) {
                maxCol = Math.max(maxCol, array[i][j]);
            }
            maxColValues[j] = maxCol;
        }

        // Print the maximum values of each row
        System.out.println("Maximum values in each row:");
        for (int i = 0; i < numRows; i++) {
            System.out.println("Row " + i + ": " + maxRowValues[i]);
        }

        // Print the maximum values of each column
        System.out.println("Maximum values in each column:");
        for (int j = 0; j < numCols; j++) {
            System.out.println("Column " + j + ": " + maxColValues[j]);
        }
    }
}
