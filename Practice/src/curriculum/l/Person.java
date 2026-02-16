package curriculum.l;

public class Person {
	// 定数化
	// 小数点第2位まで四捨五入するための精度係数
	public static final double ROUNDING_PRECISION = 100;
	
	// クラス全体で共有する変数（静的フィールド）
	public static int count = 0;
	
	// インスタンスフィールドを定義
	// (問題1)
	public String name;
	public int age;
	public double height;
	// (問題4)
	public double weight;
	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	// 問題2,3,4
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age =age;
		this.height = height;
		this.weight = weight;
		
		// インスタンスが作られるたびにカウントアップ
		Person.count++;
	}
	
	// BMI = 体重kg / (身長m * 身長m)
	// 問題6,7
	public double bmi() {
		double bmi = this.weight / (this.height * this.height);
		return bmi;
	}
	
	// 問題8,9
	public void print() {
		System.out.println("名前は"+ this.name + "です");
		System.out.println("年は"+ this.age + "です");
		// 四捨五入（Math.round 使用）
		double roundedBmi = Math.round(this.bmi() * ROUNDING_PRECISION) / ROUNDING_PRECISION;
		System.out.println("BMIは" + roundedBmi + "です");
	}
	

}
