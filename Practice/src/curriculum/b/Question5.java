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
		
		// Q4 メゾッド：
		//printHeader(5);
		
		// Q5 メゾッド：
		//printHeader(5);
		
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
