package cn.edu.qdu.text;

public class Student {
	private int stuNo;
	private double score;
	private String stuName;

	public Student(int stuNo, double score, String stuName) {
		super();
		this.stuNo = stuNo;
		this.score = score;
		this.stuName = stuName;
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", score=" + score + ", stuName=" + stuName + "]";
	}

	// @Override
	// public int compareTo(Student o) {
	// int ret = 0;
	// if (this.stuNo > o.stuNo) {
	// ret = 1;
	// } else if (this.stuNo < o.stuNo) {
	// ret = -1;
	// } else {
	// ret = 0;
	// }
	// return ret;
	// }
}
