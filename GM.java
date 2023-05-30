package TicTacToe;

import java.util.*;

public class GM{
	private DATABASE data = new DATABASE();
	private MAP map = new MAP();
	private int x;
	private int y;
	private int Player;
	private String input;
	private final int BORDER = -99;
	public GM() {
		x = 0;
		y = 0;
		Player = 0;
		input = "";
	}
	public void Movement() {
		x = 0;
		y = 0;
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		if(input.equals("W")) {
			if(data.ReadDataBase()[x+1][y] != BORDER) { x += 1;}
		}
		if(input.equals("S")) {
			if(data.ReadDataBase()[x-1][y] != BORDER) { x -= 1;}
		}
		if(input.equals("A")) {
			if(data.ReadDataBase()[x][y-1] != BORDER) { y -= 1;}
		}
		if(input.equals("D")) {
			if(data.ReadDataBase()[x][y+1] != BORDER) { y += 1;}
		}
		if(input.equals(" ")) {
			data.WriteDataBase(x, y, Player);
		}
		scan.close();
	}
	public boolean Judge(int X, int Y, int P) {
		boolean flag = false;
		if(data.ReadDataBase()[0][Y] == data.ReadDataBase()[1][Y] &&
				data.ReadDataBase()[0][Y] == data.ReadDataBase()[2][Y]) {
			if(data.ReadDataBase()[0][Y] == P) {
				flag = true;
			}
		}
		if(data.ReadDataBase()[X][0] == data.ReadDataBase()[X][1] &&
				data.ReadDataBase()[X][0] == data.ReadDataBase()[X][2]) {
			if(data.ReadDataBase()[X][0] == P) {
				flag = true;
			}
		}
		if(data.ReadDataBase()[0][0] == data.ReadDataBase()[1][1] &&
				data.ReadDataBase()[0][0] == data.ReadDataBase()[2][2]) {
			if(data.ReadDataBase()[0][0] == P) {
				flag = true;
			}
		}
		if(data.ReadDataBase()[0][2] == data.ReadDataBase()[1][1] &&
				data.ReadDataBase()[0][2] == data.ReadDataBase()[2][0]) {
			if(data.ReadDataBase()[0][2] == P) {
				flag = true;
			}
		}
		if(flag == true) {
			System.out.print("Player " + "P"+" WINS!!!!!");
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GM game = new GM();
		while(game.Judge(game.x, game.y, game.Player) != false) {
			game.Movement();
		}
		
	}
}
