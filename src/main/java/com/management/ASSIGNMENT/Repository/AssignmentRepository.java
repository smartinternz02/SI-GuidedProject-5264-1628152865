package com.management.ASSIGNMENT.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.ASSIGNMENT.Entity.Assignment;


public interface AssignmentRepository extends JpaRepository<Assignment, Long>{
	

}