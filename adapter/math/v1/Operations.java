package adapter.math.v1;

import adapter.math.v1.calc.Calculator;

public class Operations {
	//addadapter
	private Calculator calc;
	
	public int createSummaryReport(int factor) {
		int result = calc.summa(factor, 78);
		result = calc.summa(result, factor);
		return result;
	}
	
	public void setCalc(Calculator calc) {
		this.calc = calc;
	}

}
