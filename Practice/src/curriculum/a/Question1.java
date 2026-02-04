package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		// 変数byteNumの初期値を設定
		byte byteNum = 0;
		// 変数shortNumの初期値を設定
		short shortNum = 0;
		// 変数intNumの初期値を設定
		int intNum = 0;
		// 変数longNumの初期値を設定
		long longNum = 0L;
		// 変数floatNumの初期値を設定
		float floatNum = 0.0f;
		// 変数doubleNumの初期値を設定
		double doubleNum = 0.0;
		// 変数letterの初期値を設定
		char letter = '\u0000';
		// 変数lettersの初期値を設定
		String letters = null;
		// 変数isBooleanの初期値を設定
		boolean isBoolean = false;
		
		// 変数byteNumに10を代入
		byteNum = 10;
		// 変数shortNumに100を代入
		shortNum = 100;
		// 変数intNumに1000を代入
		intNum = 1000;
		// 変数longNumに10000を代入
		longNum = 10000;
		// 変数floatNumに9.5fを代入
		floatNum = 9.5f;
		// 変数doubleNumに10.5を代入
		doubleNum = 10.5;
		// 変数letterに"a"を代入
		letter = 'a';
		// 変数lettersに"ハロー"を代入
		letters = "ハロー";
		// 変数isBooleanにtrueを代入
		isBoolean = true;
		
		// 11110を出力
		System.out.println(byteNum + shortNum + intNum + longNum);
		// 20を出力
		System.out.println(byteNum + byteNum);
		// a ハロー trueを出力
		System.out.println(letter + letters + isBoolean);
		// 数字を全部足して出力
		System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum);
		// 小数点以外の数字を全てかけて出力
		System.out.println(byteNum * shortNum * intNum * longNum);
		// 10.5割る100をして出力
		System.out.println(doubleNum / shortNum);
		// 10引く100をして出力
		System.out.println(byteNum - shortNum);
		
		// こんにちは、山田太郎さん！を表示
		String name = "山田太郎";
		System.out.println("こんにちは、" + name + "さん！");
		
		// 年齢：25歳を表示
		int age = 25;
		System.out.println("年齢：" + age + "歳");
		
		// num1とnum2を足した結果をsumという変数で表示
		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		System.out.println(sum);
		
		// 最終スコア: 100 をscoreを使用して表示
		int score = 80;
		score += 20;
		System.out.println(score);
		
		// double型mで99.99を代入
		double price1 = 99.99;
		// priceをint型に変換し、整数価格:99と表示
		int price2 = (int) price1;
		System.out.println("整数価格：" + price2);
		
		// String型の変数numStrに"123"を代入
		String numStr1 = "123";
		// numStrをint型に変換してnumStr + 10した結果を表示
		int numStr2 = Integer.parseInt(numStr1);
		System.out.println(numStr2 + 10);
		
		// int型変数numに50を代入
		int numA = 50;
		// numをString型に変換し、"得点: 50点"の形で表示
		String numB = String.valueOf(numA);
		System.out.println("得点：" + numB + "点");
		
		// int型の変数aに10を代入
		int a = 10;
		// int型の変数bに20を代入
		int b = 20;
		// aがbより小さいかどうかをboolean 変数 result に代入
		boolean result = (a < b); //true
		// resultの値を表示
		System.out.println(result);
		
		// int型変数xで15を代入
		int x = 15;
		// xが10以上なら"OK"、そうでなければ"NG"を表示
		String newResult = (x >= 10) ? "OK" : "NG";
		System.out.println(newResult);
		
		// Q13
		String text = "私はJavaが好きです。Javaは楽しい！";
		/* "Java"を"Python"に置き換える(replace) */
		String newText = text.replace("Java", "Python");
		System.out.println(newText);

	}

}
