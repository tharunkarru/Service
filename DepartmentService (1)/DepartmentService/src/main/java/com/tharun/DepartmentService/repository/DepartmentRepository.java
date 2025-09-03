package com.tharun.DepartmentService.repository;

import com.tharun.DepartmentService.entity.Department;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
