package curriculum.e;

public class Main {

	public static void main(String[] args) {
		// インスタンス（オブジェクト）の作成
		Employee emp = new Employee();
		// フィールドに値を入れる
		emp.name = "山田太郎";
		// メゾッドの呼び出し
		emp.work();
		
		// 理解を深めるために2人目を追加
		Employee emp2 = new Employee();
		emp2.name = "佐藤花子";
		emp2.work();
	}

}
