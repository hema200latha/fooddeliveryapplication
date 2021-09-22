package com.sprintaws.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprintaws.entity.Order;

public interface IorderRepository extends JpaRepository<Order,String>{

}
