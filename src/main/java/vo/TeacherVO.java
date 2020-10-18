package vo;

public class TeacherVO {
	private String name;
	private String subject;
	private boolean hasHomeroom;
	private int grade;
	private int class_num;
	
	public TeacherVO(String name, String subject, boolean hasHomeroom, int grade, int class_num) {
		this.name = name;
		this.subject = subject;
		this.hasHomeroom = hasHomeroom;
		this.grade = grade;
		this.class_num = class_num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public boolean isHasHomeroom() {
		return hasHomeroom;
	}
	public void setHasHomeroom(boolean hasHomeroom) {
		this.hasHomeroom = hasHomeroom;
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
	
	@Override
	public String toString() {
		return "TeacherVO [name=" + name + ", subject=" + subject + ", hasHomeroom=" + hasHomeroom + ", grade=" + grade
				+ ", class_num=" + class_num + "]";
	}
}
