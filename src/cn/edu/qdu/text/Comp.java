package cn.edu.qdu.text;

import java.util.Comparator;

//当集合中的对象不支持自比较或者自比较的功能不能满足需求，使用外部比较器Comparator
public class Comp implements Comparator<Student> {
	double score;

	public int compare(Student o1, Student o2) {
		int res = 0;
		if (o1.getScore() > o2.getScore()) {
			res = 1;
		} else if (o1.getScore() == o2.getScore()) {
			res = 0;
		} else {
			res = -1;
		}
		return res;
	}
}
