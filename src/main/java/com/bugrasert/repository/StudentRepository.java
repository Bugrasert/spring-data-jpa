package com.bugrasert.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bugrasert.entites.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	
	@Query(value= "from Student", nativeQuery = false)
	List<Student> findAllStudents();
	
	
	

}
