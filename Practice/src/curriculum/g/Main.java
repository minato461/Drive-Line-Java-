package curriculum.g;

public class Main {

	public static void main(String[] args) {
		// インスタンス（オブジェクト）を作成
		Employee emp = new Employee();
		
		// 中身を決めて窓口を入れ込む
		emp.setEmployeeId("E002");
		emp.setName("田中花子");
		
		// 窓口から中身の表示
		System.out.println("社員ID:" + emp.getEmployeeId() + ",名前:" + emp.getName());

	}

}
