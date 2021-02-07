package com.cian.mvc;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Frank", "Pug", "frank@pugs.com"));
		students.add(new Student("Jr", "Pug", "jr@pugs.com"));
		students.add(new Student("Pauly", "Pug", "Pauly@pugs.com"));

		return students;
	}

}
