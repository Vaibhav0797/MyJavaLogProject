package com.log.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.log.entity.Log;

public interface LogRepository extends JpaRepository<Log,Long> {

}
