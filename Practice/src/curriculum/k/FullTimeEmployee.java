package curriculum.k;

// 具象クラス
public class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String name, int hours) {
		super(name, hours);
	}
	
	@Override
	public long calculateAmount() {
		// 時給1200円
		return (long) getHours() * 1200;
	}

}
