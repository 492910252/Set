package cn.edu.qdu.text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Text {
	public static void main(String[] args) {
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		map.put(1, new Student(3, 89, "Barry"));
		map.put(1, new Student(1, 85, "Hero"));
		map.put(1, new Student(2, 91, "Zero"));
		System.out.println(map.get(3));
		System.out.println("-----------------------------");
		Set<Student> set1 = new HashSet<Student>();// �����ظ�
		set1.add(new Student(3, 89, "Barry"));
		set1.add(new Student(1, 85, "Hero"));
		set1.add(new Student(2, 91, "Zero"));
		set1.add(new Student(2, 89, "Will"));
		set1.add(new Student(1, 85, "Hero"));// ������ͨ����equals()�����ж���ͬ���ݲŲ����ظ���
		// Iterator<Student> it1 = set1.iterator();//JDK1.2���� ������
		// while (it1.hasNext()) {
		// System.out.println(it1.next());
		// }
		for (Student student : set1) {// JDK1.5 ��ǿforѭ�������Ϊforeachѭ����
			System.out.println(student);
		}
		System.out.println("-----------------------------");
		Set<Student> set2 = new TreeSet<Student>();// ��Ȼ�����ظ�
		set2.add(new Student(3, 89, "Barry"));
		set2.add(new Student(1, 85, "Hero"));
		set2.add(new Student(2, 91, "Zero"));
		set2.add(new Student(2, 89, "Will"));
		set2.add(new Student(1, 85, "Hero"));// ��ͬ���ݲ����ظ�
		for (Student student : set2) {
			System.out.println(student);
		}
		System.out.println("-----------------------------");
		List<Student> list1 = new ArrayList<Student>();// ������ظ�
		list1.add(new Student(3, 89, "Barry"));
		list1.add(new Student(1, 85, "Hero"));
		list1.add(new Student(2, 91, "Zero"));
		list1.add(new Student(2, 89, "Will"));
		list1.add(new Student(1, 85, "Hero"));
		for (Student student : list1) {
			System.out.println(student);
		}
		System.out.println("-----------------------------");
		List<Student> list2 = new LinkedList<Student>();// ������ظ�
		list2.add(new Student(3, 89, "Barry"));
		list2.add(new Student(1, 85, "Hero"));
		list2.add(new Student(2, 91, "Zero"));
		list2.add(new Student(2, 89, "Will"));
		list2.add(new Student(1, 85, "Hero"));
		for (Student student : list2) {
			System.out.println(student);
		}
	}
}
