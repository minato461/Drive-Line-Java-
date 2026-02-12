package curriculum.h;

// 親子関係の宣言する
public abstract class Employee {
	// フィールドを作成
	private String employeeId;
	private String name;
	// コンストラクタの設定（誕生した瞬間にIDと名前をセット）
	public Employee(String id, String name) {
		this.employeeId = id;
		this.name = name;
	}
	
	// フィールドを外から確認できるようにする
	public String getEmployeeID() {
		return employeeId;
	}
	
	public String getName() {
		return name;
	}
	
	// 抽象メゾッドの指定
	public abstract int calculateDailyWage(int hoursWorks);

}
