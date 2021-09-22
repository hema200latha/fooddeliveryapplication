package com.sprintaws.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprintaws.entity.Cart;

public interface ICartRepository extends JpaRepository<Cart,Integer> {

}
