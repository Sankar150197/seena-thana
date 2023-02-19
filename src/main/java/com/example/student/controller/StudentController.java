package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.model.Student;
import com.example.student.modelDTO.StudentDTO;
import com.example.student.service.StudentService;
@RestController
public class StudentController {
	@Autowired
	StudentService studentService;


	//@RequestMapping(method = RequestMethod.POST, path = "/create")
	@PostMapping("/create")
	public ResponseEntity<String> createStudent(@RequestBody StudentDTO studentdto) {

		return studentService.createstudent(studentdto);
	}

	@GetMapping("/getstudents")
	private List<Student> getallstudent() {
		return studentService.getallstudents();
	}

	@GetMapping("/getstudent")
	private Student getStudent(@RequestParam("id") Integer id) {
		return studentService.getStudentsByid(id);
	}
	@DeleteMapping("/deletestudent/{id}")
	private void deleteStudent(@PathVariable("id") Integer id) {
		studentService.delete(id);
	}
	@PutMapping("/updatestudent")
	public ResponseEntity<String> updateStudent(@RequestBody StudentDTO studentdto) {

		return studentService.updatestudent(studentdto);}
}

