package curriculum.b;

//コンソール入力対応のため(Scannerを使用するため)
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		 // iが10以下の場合に繰り返し実行する処理
		for (int i = 1; i <= 10; i++){
			System.out.println(i); 
		}
		
		// iが20以下の偶数のみ繰り返し実行する処理
		for (int i = 2; i <= 20; i++){
			if (i % 2 == 0) {
			System.out.println(i); 
			}
		}
		
		// iが10〜1までカウトダウンする処理
		for (int i = 10; i >= 1; i--){
			System.out.println(i); 
		}
		
		// iが1〜100まで足していく処理
		int total = 0;
		for (int i = 1; i <= 100; i++){
			total += i;
		}
		System.out.println("1〜100までの合計：" + total); 
		
		// *での三角形を表示
		String stars = "";
		for (int i = 1; i <= 5; i++){
			stars += "*"; 
			System.out.println(stars);
		}
		
		// 1〜10まで表示
		int num1 = 1;
		while (num1 <= 10){
		System.out.println(num1);
		num1++;
		}
		
		// 20以下の偶数のみ繰り返し実行する処理
		int num2 = 2;
		while (num2 <= 20){
			if (num2 % 2 == 0) {
				System.out.println(num2);
			}
				num2++;
		}
		/* 偶数表示はfor文での記載ができる
		 * for (int i = 2; i <= 20; i += 2) {
		 *  System.out.println(i);
		 * }  */
		
		// 10〜1までカウトダウンする処理
		int num3 = 10;
		while (num3 >= 1){
		System.out.println(num3);
		num3--;
		}
		
		// 1〜100まで足していく処理
		int tt = 0;
		int num4 = 1;
		while (num4 <= 100){
			tt += num4;
			num4++;
		}
		System.out.println("1〜100までの合計：" + tt); 
		
		// 0を入力するまでループする処理
		Scanner scanner = new Scanner(System.in);
		int num5;
		do {
			System.out.println("数値を入力してください：");
			num5 = scanner.nextInt();
		}while (num5 != 0);
		System.out.println("終了しました");
		
		scanner.close();
		
		// 九九表
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				// "%02d"で2桁表示
				System.out.printf("%02d * %02d = %02d" + " || ", i, j, (i * j));
			}
			System.out.println();
		}
		
		// Q12
		// 商品一覧の定義
		String input = "パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品";
		// 1単語ずつに分割
		String[] name = input.split("、");
		
		// ランダムな整数の準備
		java.util.Random rand = new java.util.Random();
		
		// 拡張for文
		for (String str: name){
			int num = rand.nextInt(12);
			switch (str) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				System.out.println(str + "の残り台数は " + num + "台です");
				break;
			case "テレビ":
			case "ディスプレイ":
				System.out.println(str + "の残り台数は " + (str.equals("テレビ") ? num : 11-num) + "台です");
				break;
			default:
				System.out.println("『" + str + "』" + "は指定の商品ではありません");
				break;
			}
		}
	}
}
