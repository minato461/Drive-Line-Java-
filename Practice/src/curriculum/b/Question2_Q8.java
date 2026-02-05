package curriculum.b;

import java.util.Scanner;

public class Question2_Q8 {

	public static void main(String[] args) {
		// Scannerの準備、String型変数textを用意
		Scanner scanner = new Scanner(System.in);
		System.out.println("数値を入力してください：");
		String text = scanner.nextLine();
		//コンソール入力の制限：nullまたは空文字（""）のとき
		if (text == null || text.isEmpty()) {
			System.out.println("入力が無効です");
		} else {
			System.out.println("入力が有効です");
		}
		
		// Scannerを閉じる
		scanner.close();

	}

}
