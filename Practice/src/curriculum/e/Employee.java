package curriculum.e;

public class Employee {
	// フィールド：入れ物を用意する
	public String name;
	
	// メゾッドの準備
	public void work() {
		System.out.println(name + "は働いています。");
	}
	
	public static void main(String[] args) {
		// インスタンス（オブジェクト）の作成
		Employee emp = new Employee();
		// フィールドに値を入れる
		emp.name = "山田太郎";
		// メゾッドの呼び出し
		emp.work();
	}


}
