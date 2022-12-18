package program_practice;

public class Program01_05 {

	public static void main(String[] args) {
		// int型の変数nを宣言し、1からnまでの数をカンマ区切りで表示せよ。
		// 例)1,2,3,4,5
		int n = 5;
		// iがn以下➡i <= n
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
			if (i != n) {
				System.out.println(",");
			}
		}	
	}
}
