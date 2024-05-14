public class numberSpiral {

    public static void main(String[] args) {

        int n = 7;

        if (n < 3 || n > 8) {
            System.out.println("Invalid");
            return;
        }

        int[][] grid = new int[n][n];
        int num = 1;
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = n - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                grid[startRow][i] = num++;
            }
            startRow++;

            
            for (int i = startRow; i <= endRow; i++) {
                grid[i][endCol] = num++;
            }
            endCol--;

            
            for (int i = endCol; i >= startCol; i--) {
                grid[endRow][i] = num++;
            }
            endRow--;

            
            for (int i = endRow; i >= startRow; i--) {
                grid[i][startCol] = num++;
            }
            startCol++;
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
    }