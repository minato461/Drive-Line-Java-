package curriculum.b;

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
		
		// Q10
		
		// Q11
		
		
	}

}
