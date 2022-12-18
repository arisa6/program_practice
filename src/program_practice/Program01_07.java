package program_practice;

public class Program01_07 {

	public static void main(String[] args) {
		// int型の変数numの絶対値を出力するプログラムを作成せよ。
		int num1 = 100;
		int num2 = -50;
		
		num1 = Math.abs(num1);
		num2 = Math.abs(num2);
		
		System.out.println(num1);
		System.out.println(num2);
	}
}
