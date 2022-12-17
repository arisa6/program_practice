package program_practice;

public class Program01_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// int型の変数nの値に応じて出力結果が変わるプログラムを作成せよ。
		// また、出力される文言は以下の通り。
		// nが0の場合 →「0です」
		// nが正の場合 →「正です」
		// nが負の場合 →「負です」
		int n = 10;
		if ( n == 0 ) {
			System.out.println("0です");
		} else if ( n > 0 ) {
			System.out.println("正です");
		} else {
			System.out.println("負です");
		}
	}

}
