package member;

public class VIPMember extends Member{
	// To-do VIPMember�� Member���� ����� �޽��ϴ�.
	// To-do ���� ���� ���̵� �Ӽ��� �߰��մϴ�
	
	private int agentId;
	
	public VIPMember() {
		// To-do ����� VIP�� ������ �ݴϴ�.
		memberGrade = "VIP";
	}
	
	public VIPMember(int memberId, String memberName, int agentId) {
		// To-do
		this.memberId = memberId;
		this.memberName = memberName;
		this.agentId = agentId;
		
		memberGrade = "VIP";
		
	}
	
	
	public String showMemberInfo() {
		// To-do VIP ������ �����ִ� showMemberInfo �޼��带 �������ϰ�, ���� ������ �����ֵ��� �մϴ�		
		return memberName + " ȸ������ ���̵�� " + memberId + "�̸�, ȸ�� ����� " + memberGrade + ", ��� ���� id�� " + agentId + "�Դϴ�." ;
	}
	
}



