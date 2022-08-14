package manager;

public class BasicSalesRatio implements SalesRatio {

	// To-do  �Ϲ� ȸ���� ��� 5���� ���ϴ� 0%, 
	//5�������� 10���� ���ϴ� 5%, 
	//10�������� 20���� ���ϴ� 10% 20���� �ʰ��� 20% �������ݴϴ�.

	
	
	@Override
	public double[] getSalesRatio(int price) {

		if(price>200000) {
			return new double[] {0.2, price*0.8};
		}
		else if(price>100000) {
			return new double[] {0.1, price*0.9};
		}
		else if(price>50000) {
			return new double[] {0.05, price*0.95};
		}
		return new double[] {0.0, price};
	}
}
