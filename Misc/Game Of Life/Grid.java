public class Grid {
    public static final int GRID_WIDTH  = 40;
    public static final int GRID_HEIGHT = 20;
    private int[][] grid;

    public Grid() {
        grid = new int[GRID_HEIGHT][GRID_WIDTH];
        initialiseGrid(grid);
    }

    private void initialiseGrid(int[][] grid) {
        for ( int i = 0; i < grid.length; i++ ) {
            for ( int j = 0; j < grid[i].length; j++ ) {
                grid[i][j] = (int) (Math.random() * 2);
            }
        }
    }

    private int getNeighbour(int[][] grid, int i, int j, int maxX, int maxY) {
        if ( i < 0 || i > maxX || j < 0 || j > maxY ) {
            return 0;
        }
        return grid[i][j];
    }

    public void step() {
        int[][] tmp = new int[GRID_HEIGHT][GRID_WIDTH];

        for ( int i = 0; i < grid.length; i++ ) {
            for ( int j = 0; j < grid[i].length; j++ ) {
                int cell = grid[i][j];
                int nw = getNeighbour(grid, i - 1, j - 1, grid.length - 1, grid[i].length - 1);
                int n  = getNeighbour(grid, i - 1, j    , grid.length - 1, grid[i].length - 1);
                int ne = getNeighbour(grid, i - 1, j + 1, grid.length - 1, grid[i].length - 1);
                int w  = getNeighbour(grid, i    , j - 1, grid.length - 1, grid[i].length - 1);
                int e  = getNeighbour(grid, i    , j + 1, grid.length - 1, grid[i].length - 1);
                int sw = getNeighbour(grid, i + 1, j - 1, grid.length - 1, grid[i].length - 1);
                int s  = getNeighbour(grid, i + 1, j    , grid.length - 1, grid[i].length - 1);
                int se = getNeighbour(grid, i + 1, j + 1, grid.length - 1, grid[i].length - 1);

                int living = nw + n + ne + w + e + sw + s + se;

                if ( cell == 0 && living == 3 ) {
                    tmp[i][j] = 1;
                } else if ( cell == 1 && living < 2 ) {
                    tmp[i][j] = 0;
                } else if ( cell == 1 && (living == 2 || living == 3) ) {
                    tmp[i][j] = 1;
                } else if ( cell == 1 && living > 3 ) {
                    tmp[i][j] = 0;
                }
            }
        }

        grid = tmp;
    }

    public void draw() {
        for ( int i = 0; i < grid.length; i++ ) {
            for ( int j = 0; j < grid[i].length; j++ ) {
                System.out.print( grid[i][j] == 0 ? " " : "#" );
            }
            System.out.println();
        }
    }
}
