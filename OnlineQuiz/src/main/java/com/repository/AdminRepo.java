package com.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Admin;
public interface AdminRepo extends JpaRepository<Admin, Integer> {
}