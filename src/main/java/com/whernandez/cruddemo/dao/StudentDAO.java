package com.whernandez.cruddemo.dao;

import com.whernandez.cruddemo.entity.Student;

public interface StudentDAO {

	void save(Student theStudent);
	
	Student findById(Integer id);
}
