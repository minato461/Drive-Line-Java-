package curriculum.f;

public class Employee {
	// フィールド：入れ物を用意する
	public String employeeId;
	public String name;
	// メゾッドの準備
	public void showInfo() {
		System.out.println("社員ID：" + employeeId + ",名前：" + name);
	}

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
