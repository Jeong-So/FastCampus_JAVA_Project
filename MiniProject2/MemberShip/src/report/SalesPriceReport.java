package report;

import java.util.List;

import manager.BasicSalesRatio;
import manager.SalesRatio;
import manager.VIPSalesRatio;
import member.Member;

public class SalesPriceReport {

	List<Member> list;
	
	double ratio = 0.0;
	SalesRatio salesStrategy[] = {new BasicSalesRatio(), new VIPSalesRatio() };
	// FAMILY ��ް� VIP ����� ������ ������ 2������ �����մϴ�.
	
	public SalesPriceReport(List<Member> list) {
		this.list = list;
	}
	
	public void generateSaleReport(int price) {
		
		// To-do ��� FAMILY ����� ȸ����, VIP ����� ȸ���� ������ ������ ����ϴ�.
		
		int salePrice = 0;
		
		for(int i = 0; i<list.size(); i++) {
			Member member = list.get(i);
			if(member.getMemberGrade() == "Family") {
			// FAMILY ���
				System.out.println(member.showMemberInfo());
				ratio = salesStrategy[0].getSalesRatio(price)[0];
				salePrice = (int)salesStrategy[0].getSalesRatio(price)[1];
				System.out.println("��ް� ���ݿ� ���� ���� ������ " + ratio + "�̸�, ������ " + salePrice + "�Դϴ�."); 
			}
		
			else if(member.getMemberGrade() == "VIP") {
			//VIP ���
				System.out.println(member.showMemberInfo());
				ratio = salesStrategy[1].getSalesRatio(price)[0];
				salePrice = (int)salesStrategy[1].getSalesRatio(price)[1];
				System.out.println("��ް� ���ݿ� ���� ���� ������ " + ratio + "�̸�, ������ " + salePrice + "�Դϴ�.");
			}
			
			System.out.println("==========================================================");
			System.out.println();
		}
		
		}
	}
			
