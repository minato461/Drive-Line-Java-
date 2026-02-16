package curriculum.k;

//具象クラスをインポートする
import java.util.ArrayList;
//インターフェイスをインポートする
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// 社員（実体）を決める
		List<Payable> list = new ArrayList<>();
		list.add(new FullTimeEmployee("田中", 160));
		list.add(new ContractEmployee("鈴木", 140));
		
		// 監視役を呼ぶ
		SalaryReporter reporter = new SalaryReporter();
		
		// 監視役に報告をお願いする
		for (Payable p : list) {
			reporter.report(p);
		}
	}
}
