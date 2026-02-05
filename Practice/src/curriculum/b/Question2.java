package curriculum.b;

// コンソール入力対応のため(Scannerを使用するため)
import java.util.Scanner;
public class Question2 {
	
	public static void main(String[] args) {
		// int型変数scoreに75を代入
		int score = 75;
		// 60点以上なら合格と表示
		if (score >= 60) {
			System.out.println("合格です！");
		}
		
		// int型変数ageに25を代入
		int age = 25;
		/* ageが20以上30以下なら"適正年齢です"と表示
		それ以外の場合は"対象外です"と表示 */
		if (age >= 20 && age <=30) {
			System.out.println("適正年齢です");
		}
		else {
			System.out.println("対象外です");
		}
		
		// int型変数ageに18を代入
		int age1 = 18;
		/* ageが20以上30以下なら"適正年齢です"と表示
			それ以外の場合は"対象外です"と表示 */
		if (age1 >= 20) {
			System.out.println("成人です");
		}else if (age1 >= 13 && age1 <=19){
			System.out.println("ティーンエイジャーです");
		}else if (age1 <= 12){
			System.out.println("子供です");
		}
		
		// int型変数x,y,zに30,15,50を代入
		int x = 30;
		int y = 15;
		int z = 50;
		// 一番大きい数値を判定して表示
		int max;
		
		if (x >= y && x >= z) {
			max = x;
		}else if (y >= x && y >= z) {
			max = y;
		}else {
			max = z;
		}
		
		System.out.println("最大値は" + max + "です");
		
		 
		// Scannerの準備、int 型変数numを用意
		Scanner scanner = new Scanner(System.in);
		System.out.println("数値を入力してください：");
		int num = scanner.nextInt();
		
		/* num値が0より大きければ "正の数です" と表示
		 * num値が0なら "0 です" と表示
		 * num値が0より小さければ "負の数です" と表示 */
		if (num > 0) {
			System.out.println("正の数です");
		} else if (num == 0) {
			System.out.println("0 です");
		} else {
			System.out.println("負の数です");
		}
		
		// int 型変数valueを用意
		System.out.println("数値を入力して下さい：");
		int value = scanner.nextInt();
		
		// 奇数と偶数の判別をする
		if (value % 2 == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}
		
		
		// int 型変数scoreを用意
		System.out.println("0〜100の数値を入力して下さい：");
		int score1 = scanner.nextInt();
		
		/* 以下の条件下で表示する
		 * 90 以上なら "優"
		 * 70 以上なら "良"
		 * 50 以上なら "可"
		 * 50 未満なら "不可" */
		if (score1 >= 90) {
			System.out.println("優");
		} else if (score1 >= 70) {
			System.out.println("良");
		} else if (score1 >=50) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
		
		
		// int 型変数dayを用意
		System.out.println("数値を入力して下さい：");
		int day = scanner.nextInt();
		
		// 曜日を表す（1=月曜日, 2=火曜日, …, 7=日曜日）
		switch (day) {
		case 1:
			System.out.println("今日は月曜日です");
			break;
		case 2:
			System.out.println("今日は火曜日です");
			break;
		case 3:
			System.out.println("今日は水曜日です");
			break;
		case 4:
			System.out.println("今日は木曜日です");
			break;
		case 5:
			System.out.println("今日は金曜日です");
			break;
		case 6:
			System.out.println("今日は土曜日です");
			break;
		case 7:
			System.out.println("今日は日曜日です");
			break;	
		default:
			System.out.println("無効な入力です");
		}

		// int 型変数monthを用意
		System.out.println("数値を入力して下さい：");
		int month = scanner.nextInt();
		
		// 季節を表す
		switch (month) {
		case 1: case 2: case 12:
			System.out.println("冬です");
			break;
		case 3: case 4: case 5:
			System.out.println("春です");
			break;
		case 6: case 7: case 8:
			System.out.println("夏です");
			break;
		case 9: case 10: case 11:
			System.out.println("秋です");
			break;
		default:
			System.out.println("無効な月です");
		}
		
		
		// Scannerを閉じる
		scanner.close();
		
		
	}

}
