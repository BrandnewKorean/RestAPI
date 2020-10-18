package vo;

public class StudentVO {
	private int grade;
	private int class_num;
	private int num;
	private String name;
	
	public StudentVO(int grade, int class_num, int num, String name){
		this.grade = grade;
		this.class_num = class_num;
		this.num = num;
		this.name = name;
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClass_num() {
		return class_num;
	}
	public void setClass_num(int class_num) {
		this.class_num = class_num;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "StudentVO [grade=" + grade + ", class_num=" + class_num + ", num=" + num + ", name=" + name + "]";
	}
}
