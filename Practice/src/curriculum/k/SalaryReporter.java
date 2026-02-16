package curriculum.k;

// 監視役クラス（画面出力用）
public class SalaryReporter {
	// 「Payable」を持っていれば報告できる（画面表示のイメージ）
	public void report(Payable p) {
		System.out.println(p.getEmployeeName() + "の給料は" + p.calculateAmount() + "円");
	}

}
