package curriculum.l;

public class Main {

	public static void main(String[] args) {
		// 問題5
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		// リファクタリング
		person1.print();
		
		System.out.println();
		// 2人目を作成
		Person person2 = new Person("佐藤花子", 25, 1.5, 50.0);
		person2.print();
		
		System.out.println();
		// 問題10
		System.out.println("合計は" + Person.count + "人です");
	}

}
