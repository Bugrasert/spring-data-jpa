package com.bugrasert.controller;

import java.util.List;

import com.bugrasert.dto.DtoStudent;
import com.bugrasert.dto.DtoStudentIU;
import com.bugrasert.entites.Student;

public interface IStudentController {

	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
	

}
