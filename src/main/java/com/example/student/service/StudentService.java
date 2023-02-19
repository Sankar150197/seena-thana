package com.example.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.student.Repository.StudentRepository;
import com.example.student.model.Student;
import com.example.student.modelDTO.StudentDTO;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	   public ResponseEntity<String> createstudent(StudentDTO studentDTO){
		   if(studentDTO != null) {

			    Student student=new Student();
			    student.setName(studentDTO.getName());
			    student.setMobileNumber(studentDTO.getMobileNumber());
			    student.setTotalMark(studentDTO.getTotalMark());

			    studentRepository.saveAndFlush(student);
			  }
		   
		   return new ResponseEntity<String>(HttpStatus.OK);
	   }

	public List<Student> getallstudents() {
		   return studentRepository.findAll();
	}

	public Student getStudentsByid(Integer id) {
		   return studentRepository.findById(id).get();
	}
	public void delete(Integer id){
		   studentRepository.deleteById(id);
	}

	public ResponseEntity<String> updatestudent(StudentDTO studentdto) {
		   Student student =studentRepository.findById(studentdto.getId()).get();
		   if(student != null){
			   student.setName(studentdto.getName());
			   student.setMobileNumber(studentdto.getMobileNumber());
			   student.setTotalMark(studentdto.getTotalMark());
			   studentRepository.saveAndFlush(student);
		   }else {
			   Student newstudent=new Student();
			  newstudent.setName(studentdto.getName());
			  newstudent.setMobileNumber(studentdto.getMobileNumber());
			   newstudent.setTotalMark(studentdto.getTotalMark());
			   studentRepository.saveAndFlush(newstudent);
		   }

		return new ResponseEntity<String>(HttpStatus.OK);
	}
}

