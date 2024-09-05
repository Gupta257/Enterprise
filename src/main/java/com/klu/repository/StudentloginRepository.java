package com.klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klu.entity.Studentlogin;

@Repository
public interface StudentloginRepository extends JpaRepository<Studentlogin, String> {
}
