package TicTacToe;

public class DATABASE {
	private final int EMPTY = 99;
	private final int BORDER = -99;
	private int[][] array;
	public DATABASE() {
		int[][] array = new int[][]{{BORDER, BORDER, BORDER, BORDER, BORDER},
				{BORDER, EMPTY, EMPTY, EMPTY, BORDER},
				{BORDER, EMPTY, EMPTY, EMPTY, BORDER},
				{BORDER, EMPTY, EMPTY, EMPTY, BORDER},
				{BORDER, BORDER, BORDER, BORDER, BORDER}};
	}
	public int[][] ReadDataBase() {
		return array;
	}
	public void WriteDataBase(int x, int y, int p) {
		array[x][y] = p;
	}
}
