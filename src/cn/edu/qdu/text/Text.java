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
		Set<Student> set1 = new HashSet<Student>();// 无序不重复
		set1.add(new Student(3, 89, "Barry"));
		set1.add(new Student(1, 85, "Hero"));
		set1.add(new Student(2, 91, "Zero"));
		set1.add(new Student(2, 89, "Will"));
		set1.add(new Student(1, 85, "Hero"));// 必须是通过（equals()方法判断相同数据才不会重复）
		// Iterator<Student> it1 = set1.iterator();//JDK1.2出现 迭代器
		// while (it1.hasNext()) {
		// System.out.println(it1.next());
		// }
		for (Student student : set1) {// JDK1.5 增强for循环（或称为foreach循环）
			System.out.println(student);
		}
		System.out.println("-----------------------------");
		Set<Student> set2 = new TreeSet<Student>();// 自然有序不重复
		set2.add(new Student(3, 89, "Barry"));
		set2.add(new Student(1, 85, "Hero"));
		set2.add(new Student(2, 91, "Zero"));
		set2.add(new Student(2, 89, "Will"));
		set2.add(new Student(1, 85, "Hero"));// 相同数据不会重复
		for (Student student : set2) {
			System.out.println(student);
		}
		System.out.println("-----------------------------");
		List<Student> list1 = new ArrayList<Student>();// 有序可重复
		list1.add(new Student(3, 89, "Barry"));
		list1.add(new Student(1, 85, "Hero"));
		list1.add(new Student(2, 91, "Zero"));
		list1.add(new Student(2, 89, "Will"));
		list1.add(new Student(1, 85, "Hero"));
		for (Student student : list1) {
			System.out.println(student);
		}
		System.out.println("-----------------------------");
		List<Student> list2 = new LinkedList<Student>();// 有序可重复
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
