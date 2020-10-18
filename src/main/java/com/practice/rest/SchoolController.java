package com.practice.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vo.StudentVO;
import vo.TeacherVO;

@RestController
@RequestMapping("/school")
public class SchoolController {
	private static List<StudentVO> studentList = new ArrayList<StudentVO>();
	{
		studentList.add(new StudentVO(1,1,1,"a"));
		studentList.add(new StudentVO(1,1,2,"b"));
		studentList.add(new StudentVO(1,1,3,"c"));
		studentList.add(new StudentVO(1,1,4,"d"));
		studentList.add(new StudentVO(1,2,1,"e"));
		studentList.add(new StudentVO(1,2,2,"f"));
		studentList.add(new StudentVO(2,1,1,"a"));
		studentList.add(new StudentVO(2,1,2,"a"));
		studentList.add(new StudentVO(2,2,1,"b"));
		studentList.add(new StudentVO(2,2,2,"b"));
		studentList.add(new StudentVO(3,1,1,"c"));
		studentList.add(new StudentVO(3,2,1,"d"));
	}
	
	private static List<TeacherVO> teacherList = new ArrayList<TeacherVO>();
	{
		teacherList.add(new TeacherVO("A","Math",true,1,1));
		teacherList.add(new TeacherVO("B","Korean",true,1,2));
		teacherList.add(new TeacherVO("C","English",true,2,1));
		teacherList.add(new TeacherVO("D","Math",true,2,2));
		teacherList.add(new TeacherVO("E","Korean",true,3,1));
		teacherList.add(new TeacherVO("F","English",true,3,2));
		teacherList.add(new TeacherVO("G","Math",false,0,0));
		teacherList.add(new TeacherVO("H","Math",false,0,0));
		teacherList.add(new TeacherVO("H","Korean",false,0,0));
		teacherList.add(new TeacherVO("I","Korean",false,0,0));
		teacherList.add(new TeacherVO("I","English",false,0,0));
		teacherList.add(new TeacherVO("J","English",false,0,0));
	}
	
	@RequestMapping("/student/{studentno}")
	public ResponseEntity<StudentVO> getStudent(@PathVariable int studentno){
		StudentVO student = studentList.get(studentno);
		return new ResponseEntity<StudentVO>(student, HttpStatus.OK);
	}
	
	@RequestMapping("/teacher/{teacherno}")
	public ResponseEntity<TeacherVO> getTeacher(@PathVariable int teacherno){
		TeacherVO teacher = teacherList.get(teacherno);
		return new ResponseEntity<TeacherVO>(teacher, HttpStatus.OK);
	}
	
	@RequestMapping("/teacher/{teacherno}/student")
	public ResponseEntity<List<StudentVO>> TeacherStudentList(@PathVariable int teacherno){
		TeacherVO teacher = teacherList.get(teacherno);
		
		List<StudentVO> list = new ArrayList<StudentVO>();
		for(int i=0;i<studentList.size();i++) {
			StudentVO temp = studentList.get(i);
			if(teacher.getGrade() == temp.getGrade() && teacher.getClass_num() == temp.getClass_num())
				list.add(temp);
		}
		
		return new ResponseEntity<List<StudentVO>>(list, HttpStatus.OK);
	}
	
	@RequestMapping("/student/{studentno}/teacher")
	public ResponseEntity<TeacherVO> StudentTeacher(@PathVariable int studentno){
		StudentVO student = studentList.get(studentno);
		
		TeacherVO teacher = null;
		for(int i=0;i<teacherList.size();i++) {
			if(teacherList.get(i).getGrade() == student.getGrade() && teacherList.get(i).getClass_num() == student.getClass_num())
				teacher = teacherList.get(i);
		}
		return new ResponseEntity<TeacherVO>(teacher, HttpStatus.OK);
	}
}
