package curriculum.f;

public class Main {

	public static void main(String[] args) {
		// インスタンス（オブジェクト）の作成
		Employee emp = new Employee();
		// フィールドに値を入れる
		emp.employeeId = "E001";
		emp.name = "佐藤太郎";
		// メゾッドの呼び出し
		emp.showInfo();
	}

}
