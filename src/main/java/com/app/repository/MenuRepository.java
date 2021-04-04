package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.MenuItem;

public interface MenuRepository extends JpaRepository<MenuItem, Long>{

}
