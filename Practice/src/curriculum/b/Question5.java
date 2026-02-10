package curriculum.b;

public class Question5 {
	public static void main(String[] args) {
		// Q1 メゾッド：helloWorld
		printHeader(1);
		helloWorld();
		
		/* Q2 メゾッド：doubleValue
		 * (引数：整数、戻り値：引数の2倍) */
		printHeader(2);
		int input2 = 10;
		int result2 = doubleValue(input2);
		System.out.println(input2 + "を2倍すると" + result2 + "です。");
		
		/* Q3 メゾッド：isEven 
		 * (引数：整数、戻り値：偶数ならtrue、奇数ならfalse) */
		printHeader(3);
		int num1 = 7;
		int num2 = 10;
		if (isEven(num2)) {
			System.out.println(num2 + "は偶数です。");
		}
		if (!isEven(num1)) {
			System.out.println(num1 + "は奇数です。");
		}
		
		// Q4
		printHeader(4);
		// Greetingクラスのインスタンス（実体）を作る 
		Greeting greet = new Greeting();
		// インスタンスのメゾッドを呼び出す
		greet.sayHello();
		
		// Q5
		printHeader(5);
		// Animalクラスのインスタンス（実体）を作る 
		Animal animal = new Animal();
		// インスタンスのメゾッドを呼び出す
		/* 動物名(name)：ライオン
		 * 体長(length)：2.1m
		 * 速度(speed)：80km/h */
		
		// 中身を決めて窓口（setter）を入れ込む
		animal.setName("ライオン");
		animal.setLength(2.1);
		animal.setSpeed(80);
		
		// 窓口（getter）から中身の表示
		System.out.println("動物名：" + animal.getName());
		System.out.println("体長：" + animal.getLength() + "m");
		System.out.println("速度：" + animal.getSpeed() + "km/h");
		
	}
	// Qの表示用
	public static void printHeader(int no) {
		System.out.println("~Q" + no + "~");
	}
	
	// Q1
	public static void helloWorld() {
		System.out.println("Hello,World!");
	}
	
	// Q2
	public static int doubleValue(int num) {
		return num *2;
	}
	
	// Q3
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
}
