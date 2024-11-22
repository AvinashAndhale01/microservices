package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}