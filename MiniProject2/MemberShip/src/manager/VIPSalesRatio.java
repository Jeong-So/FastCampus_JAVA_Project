package manager;

public class VIPSalesRatio implements SalesRatio {
	
	//To-do VIP ȸ���� ��� 5���� ���ϴ� 0%, 
	//5�������� 10���� ���ϴ� 10%, 10�������� 20���� ���ϴ� 20%, 
	//20���� �̻��� 30%�� ������ �ݴϴ�. 
	
	
	@Override
	public double[] getSalesRatio(int price) {
		
		if(price>200000) {
			return new double[] {0.3, price*0.7};
		}
		else if(price>100000) {
			return new double[] {0.2, price*0.8};
		}
		else if(price>50000) {
			return new double[] {0.1, price*0.9};
		}
		return new double[] {0.0, price};
	}
	
}


