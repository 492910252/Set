package cn.edu.qdu.text;

import java.util.Comparator;

//�������еĶ���֧���ԱȽϻ����ԱȽϵĹ��ܲ�����������ʹ���ⲿ�Ƚ���Comparator
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
