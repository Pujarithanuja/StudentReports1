package com.cruddemo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cruddemo.entities.Student;
import com.cruddemo.repository.StudentRepository;

@SpringBootTest
class CruddemoApplicationTests {
    @Autowired
	private StudentRepository studentRepo;

	@Test
	void saveonestudent() {
		Student s= new Student();
		s.setName("Honey");
		s.setSubject("English");
		s.setSemisters(1);
		s.setMarks(50);
		studentRepo.save(s);
	}
	@Test
	void deleteoneStudent() {
		studentRepo.deleteById(4L);
		
	}
	@Test
	void updateonestudent() {
		Student s= new Student();
		s.setId(4L);
		s.setName("Malinga");
		s.setSubject("English");
		s.setMarks(45);
		studentRepo.save(s);

}
	@Test
	void getonestudent() {
		Optional<Student> findById = studentRepo.findById(5L);
		Student s=findById.get();
		
		System.out.println(s.getId());
		System.out.println(s.getSubjects());
		System.out.println(s.getName());
		System.out.println(s.getSemisters());
		System.out.println(s.getMarks());
		
	}
}
