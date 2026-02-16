package curriculum.k;

// 抽象クラス（計算用）
public abstract class Employee implements Payable {
	private String name;
	private int hours;
	
	public Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}
	
	@Override
	public String getEmployeeName() {
		return name;
	}
	
	public int getHours() {
		return hours;
	}

}
