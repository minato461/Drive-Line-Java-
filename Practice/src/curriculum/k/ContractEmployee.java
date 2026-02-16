package curriculum.k;

// 具象クラス
public class ContractEmployee extends Employee {
	public ContractEmployee(String name, int hours) {
		super(name, hours);
	}
	
	@Override
	public long calculateAmount() {
		// 時給1000円
		return (long) getHours() * 1000;
	}

}
