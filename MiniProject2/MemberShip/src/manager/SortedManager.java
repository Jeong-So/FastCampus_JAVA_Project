package manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import member.Member;

public class SortedManager {
	
	private TreeSet<Member> treeSet;
	//To-do ȸ���� �����Ͽ� �����ϱ� ���� TreeSet�� Ȱ���մϴ�.
	
	public SortedManager() {
		treeSet = new TreeSet<Member>();
	}
	
	//To-do ȸ���� �߰��ϴ� �޼��带 ����ϴ�.
	public void addMember(Member member) {
		treeSet.add(member);
	}	
	
	//To-do ȸ���� �����ϴ� �޼��带 ����ϴ�.
	public void removeMember(Member member) {
		treeSet.remove(member);
	}
	
	//To-do ��� ȸ���� �����ִ� �޼��带 ���� �մϴ�.
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member.showMemberInfo());
		}
		System.out.println();
	}
	
//	To-do ȸ�������� �������� getter�� �����մϴ�.
	public TreeSet getMemberList() {
		return treeSet;
	
	}
	
}
