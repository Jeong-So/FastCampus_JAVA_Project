package member;


public class Member implements Comparable<Member> {
	//Todo �Ϲ� ȸ�� Ŭ������ �Ӽ��� ���̵�, �̸�, ���(FAMILY) ������ �Դϴ�.
	
	protected int memberId;
	protected String memberName;
	protected String memberGrade;
	

	public Member() {
	//To-do �Ϲ� ����� �⺻ ����� FAMILY�� ����� �ݴϴ�.
		memberGrade = "Family";
	}
	
	public Member(int memberId, String memberName) {
	// To-do 
		this.memberId = memberId;
		this.memberName = memberName;
		
		memberGrade = "Family";
		
	}
	
	
	// To-do �Ϲ� ȸ�� Ŭ������ �� �Ӽ��� getter/setter�� �����մϴ�.
	
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberGrade() {
		return memberGrade;
	}
	
	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}
	

	public String showMemberInfo() {
		// To-do ȸ�� ������ �����ִ� showMemberInfo �޼��带 �����մϴ�.
		return memberName + " ȸ������ ���̵�� " + memberId + "�̸�, ȸ�� ����� " + memberGrade + "�Դϴ�." ;
	}

	
	
	//To-do ȸ���� �̸� ������ �����ϱ� ���� Comparable �޼��带 �����մϴ�.
	
	@Override
	public int compareTo(Member member) {
		return this.memberName.compareTo(member.memberName);
	}


	
}
