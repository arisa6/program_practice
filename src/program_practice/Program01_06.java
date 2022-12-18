package program_practice;

public class Program01_06 {

	public static void main(String[] args) {
		// 64, 3, 45, 291, 178の5つの要素を持つ配列arrayがある。
		// これらの要素の中から最小値を求めるプログラムを作成せよ。 
		
		int[] array = {64, 3, 45, 291, 178};
		int min = array[0];
		// 要素0番目のは代入済みのため1番目から開始する
		for (int i = 1; i < array.length; i++) {
			// minに代入されている値と配列の要素を比較して、配列の要素のほうが小さい場合値を上書きする.
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println(min);
	}

}
