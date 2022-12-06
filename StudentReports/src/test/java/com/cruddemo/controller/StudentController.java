package com.cruddemo.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.Requestmapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.cruddemo.entities.Student;
import com.cruddemo.repository.StudentRepository;
import org.springframework.stereotype.Controller;
 
@Controller
public class StudentController {
	
	
	@Autowired
	StudentRepository studentRepo;
	
	@RequestMapping("/showReportCards")
	public String showReportCards() {
		return "showReportCards";
		
		@Requestmapping("/saveMarks")
		public String saveMarks(@ModelAttribute("Student")Student student,ModelMap modelMap) {
			studentRepo.save(student);
			System.out.println(student.getName()); 
			System.out.println(student.getMobile()); 
			System.out.println(student.getSubjects()); 
			System.out.println(student.getSemisters()); 
			System.out.println(student.getMarks()); 
			System.out.println(student.getAverageMarks());
			modelMap.addAttribute("msg","students reports saved");
			return "showReportCards";
		}
		@Requestmapping("\viewReportCards")
		public String viewStudent(ModelMap modelMap) {
			List<Student>student=studentRepo.findAll();
			modelMap.addAttribute("Student", student);
			return "viewReportCards";
		}
	    @RequestMapping("/deleteStudent")
		public String deleteStudent(@RequestParam("id")Lond id,ModelMap modelMap) {
			studentRepo.deleteById(id);
			List<student>student=studentRepo.findAll();
			modelMap.addAttribute("Student", student);
			return "viewStudent";
		}
	    @RequestMapping("/updateStudent")
		public String deleteStudent(@RequestParam("id")Lond id,ModelMap modelMap) {
	    	Optional<Student>findByid=studentRepo.findById(id);
	    	Student student=findById.get();
	    	modelMap.addAttribute("id", student.getId());
	    	modelMap.addAttribute("name", student.getName());
	    	modelMap.addAttribute("mobile", student.getMobile());
	    	modelMap.addAttribute("subjects", student.getSubjects());
	    	modelMap.addAttribute("semisters", student.getSemisters());
	    	modelMap.addAttribute("marks", student.getMarks());
	    	modelMap.addAttribute("averagemarks", student.getAverageMarks());
	    	return "updateStudent";
	    }
	    @RequestMapping("/updateStudentReports")
		public String updateStudentReports(@RequestParam("student")Student student,ModelMap modelMap) {
	    	student.setId(student.getId());
	    	student.setId(student.getName());
	    	student.setId(student.getMobile());
	    	student.setId(student.getSubjects());
	    	student.setId(student.getSemisters());	    	
	    	student.setId(student.getMarks());
	    	student.setId(student.getAverageMarks());
	    	modelMap.addAttribute("updateMsg", "student record is updated");
	    	return "updatestudent";
	    	
	}
		
	
	
}

}
							