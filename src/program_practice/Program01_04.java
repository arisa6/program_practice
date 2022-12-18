package program_practice;

public class Program01_04 {

	public static void main(String[] args) {
		// int型の変数nが0まで1ずつ増減するプログラムを作成せよ。
		// nが正の場合は減り、負の場合は増えていくこと。
		int n = 5;
		if (n > 0) {
			for (int i = n; i >= 0; i-- ) {
				System.out.println(i);
			}
		} else {
			for (int i = n; i <= 0; i++) {
				System.out.println(i);
			}
		}
	}

}
