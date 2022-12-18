package program_practice;

public class Program01_03 {

	public static void main(String[] args) {
		// int型の変数nが偶数か奇数か判定するプログラムを作成せよ。
		int n = 2;
		int str = (n % 2);
		// messageを通知する
		String message;
		
		// nが0で割り切れると"偶数"
		if (str == 0) {
			System.out.println("偶数です");
		// nが0で割り切れないと"奇数"
		} else {
			System.out.println("奇数です");
		}

	}

}
