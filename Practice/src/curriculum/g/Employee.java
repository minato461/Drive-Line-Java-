package curriculum.g;

public class Employee {
	// フィールド（private）を作成
	private String employeeId;
	private String name;
	
	// 社員ID
	// 外からデータを入れるための窓口(set)
	public void setEmployeeId(String id) {
		this.employeeId = id;
	}
	// 外にデータを渡すための窓口(get)
	public String getEmployeeId() {
		return employeeId;
	}
	
	// 名前
	// 外からデータを入れるための窓口(set)
	public void setName(String name) {
		this.name = name;
	}
	// 外にデータを渡すための窓口(get)
	public String getName() {
		return name;
	}

}
