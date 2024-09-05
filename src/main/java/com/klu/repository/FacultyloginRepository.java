package com.klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.klu.entity.Facultylogin;


@Repository
public interface FacultyloginRepository extends JpaRepository<Facultylogin, String> {
}
